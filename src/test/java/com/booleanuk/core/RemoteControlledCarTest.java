package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoteControlledCarTest {

    @Test
    public void testChooseColorForRC() {
        RemoteControlledCar rc = new RemoteControlledCar("Red");
        Assertions.assertEquals("Red", rc.colour);
    }

    @Test
    public void testChooseColorForRCWrongColour() {
        RemoteControlledCar rc = new RemoteControlledCar("Red");
        Assertions.assertNotEquals("White", rc.colour);
    }

}