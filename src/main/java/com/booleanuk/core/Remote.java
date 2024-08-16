package com.booleanuk.core;

public class Remote {
    String type;
    Car connectedCar;

    public Remote(String type, Car connectedCar) {
        this.type = type;
        this.connectedCar = connectedCar;
    }

    public int turn(int leftOrRight) {
        //Left is 1 and right is 2 and straight is 0.
        return leftOrRight;
    }
}
