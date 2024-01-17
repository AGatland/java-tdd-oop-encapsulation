package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlledCarTest {

    @Test
    public void testChooseColorForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable");
        Assertions.assertEquals("Red", rc.colour);
    }

    @Test
    public void testChooseColorForRCWrongColour() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable");
        Assertions.assertNotEquals("White", rc.colour);
    }

    @Test
    public void testChooseDisposableBatteryTypeForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable");
        Assertions.assertNotEquals("disposable", rc.battery.type);
    }

    @Test
    public void testChooseRechargableBatteryTypeForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "rechargable");
        Assertions.assertNotEquals("rechargable", rc.battery.type);
    }

}