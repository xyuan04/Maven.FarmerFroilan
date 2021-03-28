package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.Iterator;

public class EdibleStorage {
    private ArrayList<Edible> edibleStorage;

    public EdibleStorage() {
        edibleStorage = new ArrayList<Edible>();
    }

    public ArrayList<Edible> getEdibleStorage() {
        return edibleStorage;
    }

    public void addFood(Edible edible) {
        edibleStorage.add(edible);
    }

    public void removeFood(Edible edible) {
        edibleStorage.remove(edible);
    }

    public Edible getFood() {
        Iterator<Edible> iterator = edibleStorage.iterator();

        return iterator.next();
    }
}
