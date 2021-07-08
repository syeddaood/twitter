package com.example.app.model;

public class wind {
    float speed;
    int degree;

    @Override
    public String toString() {
        return "wind{" +
                "speed=" + speed +
                ", degree=" + degree +
                '}';
    }

    public float getSpeed() {
        return speed;
    }

    public int getDegree() {
        return degree;
    }
}
