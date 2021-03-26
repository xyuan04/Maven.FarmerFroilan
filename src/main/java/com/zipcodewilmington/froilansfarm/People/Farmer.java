package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Animals.Animal;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Interfaces.*;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;

public class Farmer extends Person implements Eater<Edible>, NoiseMaker, Botanist, Rider {
    private Rideable currentlyRiding;

    public Farmer(String name) {
        super(name);
    }

    public void plant(Crop crop, CropRow cropRow) {
        cropRow.addCrop(crop);
    }

    public void mount(Rideable ride) {
        currentlyRiding = ride;
        ride.riding(this);
    }

    public void fertilizeProduce(Produce produce) {
        produce.fertilize();
    }

    public void dismount() {
        currentlyRiding = null;
    }

    public void feed(Animal animal, Vegetable food) {
        animal.eat(food);
    }

    @Override
    public String makeNoise() {
        return "YEEEHAW!";
    }
}
