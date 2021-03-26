package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Storage.FarmHouse;
import com.zipcodewilmington.froilansfarm.Storage.Stable;

import java.util.ArrayList;
import java.util.Arrays;

public class Farm {
    private ArrayList<Stable> stables;
    private ArrayList<ChickenCoop> chickenCoops;
    private FarmHouse farmHouse;

    public Farm() {
        stables = new ArrayList<Stable>();
        chickenCoops = new ArrayList<ChickenCoop>();
    }

    public void addStables(Stable... stable)  {
        stables.addAll(Arrays.asList(stable));
    }

    public void addChickenCoops(ChickenCoop... chickenCoop) {
        chickenCoops.addAll(Arrays.asList(chickenCoop));
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }
}
