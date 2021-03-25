package com.zipcodewilmington.froilansfarm;

public abstract class Aircraft extends Vehicle {

    public Aircraft(String type) {
        super(type);
    }

    public String fly() {
        return "Flying!";
    }

}
