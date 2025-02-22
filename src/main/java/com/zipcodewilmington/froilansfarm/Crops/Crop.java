package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Produce;
import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;

public abstract class Crop implements Produce<Vegetable> {
    private boolean fertilized = false;
    private boolean harvested = false;

    public abstract Vegetable yield();
    
    public void fertilize() {
        fertilized = true;
    }

    public boolean hasBeenFertilized() {
        return fertilized;
    }
    
    public void harvest() {
        harvested = true;
    }

    public boolean hasBeenHarvested() {
        return harvested;
    }

}
