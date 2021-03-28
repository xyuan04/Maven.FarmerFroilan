package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Rideable;
import com.zipcodewilmington.froilansfarm.Interfaces.Rider;

public class Horse extends Animal implements Rideable {
    private Rider currentRider;
    private boolean mounted = false;
    private int timesRode = 0;

    public Horse(String type) {
        super(type);
    }


    public int getTimesRode() {
        return timesRode;
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

    public boolean isMounted() {
        return mounted;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }

    public Rider getCurrentRider() {
        return currentRider;
    }
}
