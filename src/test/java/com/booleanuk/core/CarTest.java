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

        //Turn Left
        Assertions.assertEquals(2, remote.turn(2));
        //Turn right
        Assertions.assertEquals(1, remote.turn(1));
        //Go Straight
        Assertions.assertEquals(0, remote.turn(0));

    }
}
