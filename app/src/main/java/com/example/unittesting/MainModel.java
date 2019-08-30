package com.example.unittesting;

// use main model to definision  volume
public class MainModel {
    private double volume;

    // to make object variable
    public MainModel(double volume) {
        this.volume = volume;
    }
    // to get volume
    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
