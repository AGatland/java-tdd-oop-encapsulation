package com.booleanuk.core;

public class RemoteControlledCar {
    String colour;
    Battery battery;

    public RemoteControlledCar(String colour, String batteryType) {
        this.colour = colour;
        this.battery = new Battery(batteryType);
    }
}
