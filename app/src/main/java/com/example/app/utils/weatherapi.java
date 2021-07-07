package com.example.app.utils;

import com.example.app.response.currentweather;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface weatherapi {

    @GET("/current.json")
    Call<currentweather> cweather();

}
