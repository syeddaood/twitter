package com.example.app.model;

public class wind {
    private float wind;
    private float deg;

    @Override
    public String toString() {
        return "wind{" +
                "wind=" + wind +
                ", deg=" + deg +
                '}';
    }

    public float getWind() {
        return wind;
    }

    public void setWind(float wind) {
        this.wind = wind;
    }

    public float getDeg() {
        return deg;
    }

    public void setDeg(float deg) {
        this.deg = deg;
    }
}
