package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animals.Horse;

import java.util.ArrayList;
import java.util.Iterator;

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

    public void removeHorse(Horse horse) {
        stable.remove(horse);
    }

    public Horse getHorse() {
        Iterator<Horse> iterator = stable.iterator();

        return iterator.next();
    }

    public int sizeOfStable() {
        return stable.size();
    }
}
