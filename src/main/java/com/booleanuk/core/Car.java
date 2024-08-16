package com.booleanuk.core;

public class Car {
    String color;
    Battery battery;
    Remote remote;

    Car(String color, Battery battery, Remote remote) {
        this.color = color;
        this.battery = battery;
        this.remote = remote;
    }
}
