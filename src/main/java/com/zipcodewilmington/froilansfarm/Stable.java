package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;

public class Stable {
    private ArrayList<Horse> stable;

    public Stable() {
        stable = new ArrayList<Horse>();
    }

    public ArrayList<Horse> getStable() {
        return stable;
    }
    
    public void addHorse(Horse horse) {
        stable.add(horse);
    }

    public Horse removeHorse() {
        stable.get()
    }
}
