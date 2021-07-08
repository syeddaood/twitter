package com.example.app.model;

public class coordinate {
    float lat;
    float lon;

    @Override
    public String toString() {
        return "coordinate{" +
                "lat=" + lat +
                ", lon=" + lon +
                '}';
    }

    public float getLat() {
        return lat;
    }

    public float getLon() {
        return lon;
    }
}
