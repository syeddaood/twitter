package com.example.app.model;

import android.os.Parcel;
import android.os.Parcelable;

public class weatherclass implements Parcelable {

    private int temp;
    private int pressure;
    private int humidity;

    public weatherclass(int temp, int pressure, int humidity) {
        this.temp = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    protected weatherclass(Parcel in) {
        temp = in.readInt();
        pressure = in.readInt();
        humidity = in.readInt();
    }

    public static final Creator<weatherclass> CREATOR = new Creator<weatherclass>() {
        @Override
        public weatherclass createFromParcel(Parcel in) {
            return new weatherclass(in);
        }

        @Override
        public weatherclass[] newArray(int size) {
            return new weatherclass[size];
        }
    };

    public int getTemp() {
        return temp;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(temp);
        parcel.writeInt(pressure);
        parcel.writeInt(humidity);
    }
}
