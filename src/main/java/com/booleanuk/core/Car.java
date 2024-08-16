package com.booleanuk.core;

public class Car {
    String color;
    Battery battery;
    int currentSpeed;

    public Car(String color, Battery battery) {
        this.color = color;
        this.battery = battery;
        this.currentSpeed = 0;
    }

}
