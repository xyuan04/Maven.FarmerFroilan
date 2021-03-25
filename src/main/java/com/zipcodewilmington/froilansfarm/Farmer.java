package com.zipcodewilmington.froilansfarm;

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
