package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce<Egg> {
    private boolean fertilized = false;

    public Chicken(String type) {
        super(type);
    }

    public Egg yield() {
        if(fertilized == true) {
            return new Egg();
        }
        return null;
    }

    public void fertilize() {
        fertilized = true;
    }

    public boolean hasBeenFertilized() {
        return fertilized;
    }

    @Override
    public String makeNoise() {
        return "Cluck!";
    }
}
