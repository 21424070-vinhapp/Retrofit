package com.example.retrofit;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;

public interface DemoService {

    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Example> fetchExample1();

}
