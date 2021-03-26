package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class CropDuster extends Aircraft implements FarmVehicle {
    private Farm currentFarm;

    public CropDuster() {
        super("CropDuster");
    }

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    @Override
    public String makeNoise() {
        return "Eeeeeaaarrrr!";
    }
}
