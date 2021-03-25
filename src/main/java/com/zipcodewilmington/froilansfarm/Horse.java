package com.zipcodewilmington.froilansfarm;

public class Horse extends Animal implements Rideable {
    private boolean mounted = false;
    private int timesRode = 0;

    public Horse(String name) {
        super(name, "Horse");
    }

    public int getTimesRode() {
        return timesRode;
    }

    public void mounted() {
        mounted = true;
        timesRode++;
    }

    public void dismounted() {
        mounted = false;
    }

    public boolean isMounted() {
        return mounted;
    }

    @Override
    public String makeNoise() {
        return "Neigh!";
    }
}
