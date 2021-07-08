package com.example.app.model;

import android.os.Parcel;
import android.os.Parcelable;

public class weatherclass  {

   private float temp;
    private int pressure;
    private int humidity;

    protected weatherclass(Parcel in) {
        temp = in.readFloat();
        pressure = in.readInt();
        humidity = in.readInt();
    }

    public static final Parcelable.Creator<weatherclass> CREATOR = new Parcelable.Creator<weatherclass>() {
        @Override
        public weatherclass createFromParcel(Parcel in) {
            return new weatherclass(in);
        }

        @Override
        public weatherclass[] newArray(int size) {
            return new weatherclass[size];
        }
    };

    @Override
    public String toString() {
        return "weatherclass{" +
                "temp=" + temp +
                ", pressure=" + pressure +
                ", humidity=" + humidity +
                '}';
    }

    public float getTemp() {
        return temp;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }




}
