package com.zipcodewilmington.froilansfarm;

public abstract class Vehicle implements NoiseMaker, Rideable{
    private String type;
    private boolean mounted = false;
    private int timesRode = 0;
    
    public Vehicle(String type) {
        this.type = type;
    }

    public String makeNoise() {
        return "Vroom!";
    }

    public void mounted() {
        mounted = true;
        timesRode++;
    }

    public void dismounted() {
        mounted = false;
    }

    public void clearRides() {
        timesRode = 0;
    }
}
