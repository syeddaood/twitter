package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.app.model.weatherclass;
import com.example.app.request.service;
import com.example.app.response.currentweather;
import com.example.app.utils.weatherapi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Button btn = findViewById(R.id.button);
    TextView tx = findViewById(R.id.textView);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GetRetrofitResponse();
            }
        });

    }

    void GetRetrofitResponse()
    {
        weatherapi Weatherapi = service.getWeatherapi();

        Call<currentweather> responsecall = Weatherapi.cweather();
        responsecall.enqueue(new Callback<currentweather>() {
            @Override
            public void onResponse(Call<currentweather> call, Response<currentweather> response) {
                currentweather weatherclass;

            }

            @Override
            public void onFailure(Call<currentweather> call, Throwable t) {

            }
        });

    }


}