package com.example.app.response;

import com.example.app.model.weatherclass;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

// current weather request
public class currentweather {

    @SerializedName( "weather")
    @Expose
    private weatherclass Weatherclass;

    private weatherclass getWeatherclass()
    {
        return Weatherclass;
    }

    @Override
    public String toString() {
        return "currentweather{" +
                "Weatherclass=" + Weatherclass +
                '}';
    }
}
