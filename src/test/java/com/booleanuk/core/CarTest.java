package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void carExistTest() {
        Car car = new Car("Red", new Battery("Rechargeable"));
        Remote remote = new Remote("Simple", car);


        Assertions.assertEquals("Red", car.color);
    }

    @Test
    public void carGoLeft() {
        Battery battery = new Battery("Rechargeable");
        Remote remote = new Remote("Simple", new Car("Blue", battery));

        Assertions.assertTrue(remote.turnLeft());
    }
}
