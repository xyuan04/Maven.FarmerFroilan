package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import com.zipcodewilmington.froilansfarm.Storage.Stable;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private ArrayList<Edible> edibleStorage;
    private FarmHouse farmHouse;
    private Field field;

    public Farm(FarmHouse farmHouse, Field field) {
        this.farmHouse = farmHouse;
        this.field = field;
        stables = new ArrayList<Stable>();
        chickenCoops = new ArrayList<ChickenCoop>();
        edibleStorage = new ArrayList<Edible>();
    }

    public void addStables(Stable... stable)  {
        stables.addAll(Arrays.asList(stable));
    }

    public void addChickenCoops(ChickenCoop... chickenCoop) {
        chickenCoops.addAll(Arrays.asList(chickenCoop));
    }

    public ArrayList<Stable> getStables() {
        return stables;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public ArrayList<Edible> getEdibleStorage() {
        return edibleStorage;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }
}
