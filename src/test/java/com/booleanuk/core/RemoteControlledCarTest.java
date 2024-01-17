package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlledCarTest {

    @Test
    public void testChooseColorForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable", "simple");
        Assertions.assertEquals("Red", rc.colour);
    }

    @Test
    public void testChooseColorForRCWrongColour() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable", "simple");
        Assertions.assertNotEquals("White", rc.colour);
    }

    @Test
    public void testChooseDisposableBatteryTypeForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable", "simple");
        Assertions.assertEquals("disposable", rc.battery.type);
    }

    @Test
    public void testChooseRechargableBatteryTypeForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "rechargable", "simple");
        Assertions.assertEquals("rechargable", rc.battery.type);
    }

    @Test
    public void testChooseAdvancedRemoteTypeForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable", "advanced");
        Assertions.assertEquals("advanced", rc.remoteType);
    }

    @Test
    public void testChooseSimpleRemoteTypeForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable", "simple");
        Assertions.assertEquals("simple", rc.remoteType);
    }

    @Test
    public void testChooseRemoteTypeForRCWrongType() {
        RemoteControlledCar rc = new RemoteControlledCar("Red", "disposable", "simple");
        Assertions.assertNotEquals("advanced", rc.remoteType);
    }

}