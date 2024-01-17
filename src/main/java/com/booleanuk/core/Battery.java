package com.booleanuk.core;

public class Battery {
    String type;
    double batteryPercentage;

    public Battery(String type) {
        this.type = type;
        this.batteryPercentage = 1d;
    }

    public int getBatteryRemaining() {
        return (int) Math.round(batteryPercentage*100);
    }
}
