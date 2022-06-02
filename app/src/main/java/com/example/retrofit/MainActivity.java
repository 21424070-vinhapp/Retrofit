package com.example.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.retrofit.api.DemoService;
import com.example.retrofit.model.demo1.Example;
import com.example.retrofit.model.demo2.Example2;
import com.example.retrofit.model.demo3.Example3;
import com.example.retrofit.model.demo4.Example4;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private DemoService demoService;
    private final String TAG = "BBB";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);


        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .readTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true)
                .addInterceptor(interceptor)
                .protocols(Arrays.asList(Protocol.HTTP_1_1))
                .build();

        Gson gson = new GsonBuilder()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://khoapham.vn/")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        demoService = retrofit.create(DemoService.class);

//        callDemo1();
//        callDemo2();
//        callDemo3();
        callDemo4();
    }

    private void callDemo1() {
        Call<Example> callApi1 = (Call<Example>) demoService.fetchExample1();
        callApi1.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                if (response.errorBody() != null) {
                    try {
                        Log.d("BBB", "onResponse: " + response.errorBody().string());
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                Example example = response.body();
                Log.d("BBB", "onResponse: " + example.toString());
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("BBB", "onFailure: " + t.getMessage());
            }
        });
    }

    private void callDemo2() {
        Call<Example2> callApi2 = demoService.fetchExample2();
        callApi2.enqueue(new Callback<Example2>() {
            @Override
            public void onResponse(Call<Example2> call, Response<Example2> response) {
                if (response.errorBody() != null) {
                    try {
                        Log.d("BBB", "onResponse: " + response.errorBody().string());
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                Example2 example2 = response.body();
                Log.d("BBB", "onResponse: " + example2);
            }

            @Override
            public void onFailure(Call<Example2> call, Throwable t) {
                Log.d("BBB", "onFailure: " + t.getMessage());
            }
        });
    }

    private void callDemo3() {
        Call<Example3> callApi3 = demoService.fetchExample3();

        callApi3.enqueue(new Callback<Example3>() {
            @Override
            public void onResponse(Call<Example3> call, Response<Example3> response) {
                if (response.errorBody() != null) {
                    try {
                        Log.d("BBB", "onResponse: " + response.errorBody().string());
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                Example3 example3 = response.body();
                Log.d("BBB", "onResponse: " + example3);
            }

            @Override
            public void onFailure(Call<Example3> call, Throwable t) {
                Log.d("BBB", "onFailure: " + t.getMessage());
            }
        });
    }

    private void callDemo4() {
        Call<List<Example4>> callApi4 = demoService.fetchExample4();
        callApi4.enqueue(new Callback<List<Example4>>() {
            @Override
            public void onResponse(Call<List<Example4>> call, Response<List<Example4>> response) {
                if (response.errorBody() != null) {
                    try {
                        Log.d(TAG, "onResponse: "+response.errorBody().string());
                        return;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                List<Example4> lstExample4=response.body();
                for (Example4 example4: lstExample4) {
                    Log.d(TAG, "onResponse: "+example4);
                }
            }

            @Override
            public void onFailure(Call<List<Example4>> call, Throwable t) {
                Log.d("BBB", "onFailure: " + t.getMessage());
            }
        });
    }
}