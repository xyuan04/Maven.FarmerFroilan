package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;

public class TomatoPlant extends Crop {

    public Vegetable yield() {
        return new Tomato();
    }

}
