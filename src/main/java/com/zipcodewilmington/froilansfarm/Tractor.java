package com.zipcodewilmington.froilansfarm;

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
