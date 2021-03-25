package com.zipcodewilmington.froilansfarm;

public class TomatoPlant extends Crop {

    public Vegetable yield() {
        return new Tomato();
    }

}
