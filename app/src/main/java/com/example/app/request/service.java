package com.example.app.request;

import com.example.app.utils.Credentials;
import com.example.app.utils.weatherapi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class service {

    private static Retrofit.Builder retrofitBuilder =
            new Retrofit.Builder().baseUrl(Credentials.Base_URL)
            .addConverterFactory(GsonConverterFactory.create());


    private static Retrofit retrofit =retrofitBuilder.build();
    private static weatherapi Weatherapi =retrofit.create(weatherapi.class);

    public static weatherapi getWeatherapi() {
        return Weatherapi;
    }
}
