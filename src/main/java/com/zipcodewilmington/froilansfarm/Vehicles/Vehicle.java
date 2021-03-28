package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Farmer;

public abstract class Vehicle implements NoiseMaker, Rideable {
    private Rider currentRider;
    private String type;
    private boolean mounted = false;
    private int timesRode = 0;
    
    public Vehicle(String type) {
        this.type = type;
    }

    public String makeNoise() {
        return "Vroom!";
    }

    public void riding(Rider rider) {
        currentRider = rider;
        mounted();
    }

    public void mounted() {
        mounted = true;
        timesRode++;
    }

    public void dismounted() {
        currentRider = null;
        mounted = false;
    }

    public void clearRides() {
        timesRode = 0;
    }

    public Rider getCurrentRider() {
        return currentRider;
    }

    public String getType() {
        return type;
    }

    public boolean isMounted() {
        return mounted;
    }

    public int getTimesRode() {
        return timesRode;
    }
}
