package com.booleanuk.core;

public class RemoteControlledCar {
    String colour;
    Battery battery;
    String remoteType;

    public RemoteControlledCar(String colour, String batteryType, String remoteType) {
        this.colour = colour;
        this.battery = new Battery(batteryType);
        this.remoteType = remoteType;
    }

    public int getBatteryPercentage() {
        return this.battery.getBatteryRemaining();
    }
}
