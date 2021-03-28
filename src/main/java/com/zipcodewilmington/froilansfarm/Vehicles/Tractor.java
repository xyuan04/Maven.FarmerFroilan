package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Field;

public class Tractor extends Vehicle implements FarmVehicle {
    private Farm currentFarm;

    public Tractor() {
        super("Tractor");
    }

    public void operate(Farm farm) {
        currentFarm = farm;
        Field currentField = currentFarm.getField();

        for(int i = 0; i < currentField.sizeOfField(); i++) {
            CropRow currentCropRow = currentField.getCropRow(i);
            for (int j = 0; j < currentCropRow.sizeOfRow(); j++) {
                farm.getEdibleStorage().add(currentCropRow.getCrop().yield());
            }
        }
    }

    @Override
    public String makeNoise() {
        return "Brrr Brrr!";
    }
}
