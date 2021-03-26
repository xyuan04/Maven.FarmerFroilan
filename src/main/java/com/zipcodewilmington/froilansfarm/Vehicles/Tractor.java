package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;

public class Tractor extends Vehicle implements FarmVehicle {
    private Farm currentFarm;

    public Tractor() {
        super("Tractor");
    }

    public void operate(Farm farm) {
        currentFarm = farm;
    }

    @Override
    public String makeNoise() {
        return "Brrr Brrr!";
    }
}
