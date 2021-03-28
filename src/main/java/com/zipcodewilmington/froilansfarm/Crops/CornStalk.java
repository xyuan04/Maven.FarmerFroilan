package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;

public class CornStalk extends Crop {

    public Vegetable yield() {
        if(this.hasBeenFertilized()) {
            return new Corn();
        } else return null;
    }

}
