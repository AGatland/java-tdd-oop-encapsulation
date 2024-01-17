package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BatteryTest {

    @Test
    public void testGetBatteryPercentage() {
        Battery battery = new Battery("disposable");
        Assertions.assertEquals(100, battery.getBatteryRemaining());
    }

}