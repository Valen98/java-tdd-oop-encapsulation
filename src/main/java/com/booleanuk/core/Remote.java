package com.booleanuk.core;

public class Remote {
    String type;
    Car connectedCar;

    public Remote(String type, Car connectedCar) {
        this.type = type;
        this.connectedCar = connectedCar;
    }
}
