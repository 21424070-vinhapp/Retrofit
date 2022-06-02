package com.example.retrofit.api;

import com.example.retrofit.model.demo1.Example;
import com.example.retrofit.model.demo2.Example2;
import com.example.retrofit.model.demo3.Example3;
import com.example.retrofit.model.demo4.Example4;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DemoService {

    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Example> fetchExample1();

    @GET("KhoaPhamTraining/json/tien/demo2.json")
    Call<Example2> fetchExample2();

    @GET("KhoaPhamTraining/json/tien/demo3.json")
    Call<Example3> fetchExample3();

    @GET("KhoaPhamTraining/json/tien/demo4.json")
    Call<List<Example4>> fetchExample4();
}
