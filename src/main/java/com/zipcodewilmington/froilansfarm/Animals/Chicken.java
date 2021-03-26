package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Produce;

public class Chicken extends Animal implements Produce<Egg> {
    private boolean fertilized = false;

    public Chicken(String name) {
        super(name, "Chicken");
    }

    public Egg yield() {
        return new Egg();
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
