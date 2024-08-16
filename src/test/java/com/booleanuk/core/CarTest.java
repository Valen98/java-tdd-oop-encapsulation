package com.booleanuk.core;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void carExistTest() {
        Car car = new Car("Red", new Battery("Rechargeable"), new Remote("Simple"));
    }
}
