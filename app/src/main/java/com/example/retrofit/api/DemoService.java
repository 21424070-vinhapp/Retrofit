package com.example.retrofit.api;

import com.example.retrofit.model.Example;
import com.example.retrofit.model.Example2;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DemoService {

    @GET("KhoaPhamTraining/json/tien/demo1.json")
    Call<Example> fetchExample1();

    @GET("KhoaPhamTraining/json/tien/demo2.json")
    Call<Example2> fetchExample2();

}
