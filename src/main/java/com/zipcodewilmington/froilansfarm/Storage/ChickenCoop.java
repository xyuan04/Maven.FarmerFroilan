package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;

import java.util.ArrayList;
import java.util.Iterator;

public class ChickenCoop {
    private ArrayList<Chicken> chickenCoop;

    public ChickenCoop() {
        chickenCoop = new ArrayList<Chicken>();
    }

    public ArrayList<Chicken> getChickenCoop() {
        return chickenCoop;
    }

    public void addChicken(Chicken chicken) {
        chickenCoop.add(chicken);
    }

    public void removeChicken(Chicken chicken) {
        chickenCoop.remove(chicken);
    }

    public Chicken getChicken() {
        Iterator<Chicken> iterator = chickenCoop.iterator();

        return iterator.next();
    }

    public int size() {
        return chickenCoop.size();
    }
}
