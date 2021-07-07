package com.example.app.model;

public class coord {
    private float lan;
    private float lon;

    @Override
    public String toString() {
        return "coord{" +
                "lan=" + lan +
                ", lon=" + lon +
                '}';
    }

    public float getLan() {
        return lan;
    }

    public void setLan(float lan) {
        this.lan = lan;
    }

    public float getLon() {
        return lon;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }
}
