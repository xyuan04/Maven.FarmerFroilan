package com.zipcodewilmington.froilansfarm.Vehicles;

public abstract class Aircraft extends Vehicle {

    public Aircraft(String type) {
        super(type);
    }

    public String fly() {
        return "Flying!";
    }

}
