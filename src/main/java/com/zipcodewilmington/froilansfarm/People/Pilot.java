package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;

public class Pilot extends Farmer{

    public Pilot(String name) {
        super(name);
    }

    public void flyVehicle(CropDuster flyer, Farm farm) {
        flyer.operate(farm);
    }
}
