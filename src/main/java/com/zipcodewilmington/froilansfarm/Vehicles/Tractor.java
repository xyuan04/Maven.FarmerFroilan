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

        if(isMounted()) {
            for (int i = 1; i <= currentField.sizeOfField(); i++) {
                CropRow currentCropRow = currentField.getCropRow(i);
                for (int j = currentCropRow.sizeOfRow() - 1; j >= 0; j--) {
                    if (currentCropRow.crops.get(j).hasBeenFertilized()) {
                        farm.getEdibleStorage().addFood(currentCropRow.getCrop().yield());
                    }
                }
            }
        }
    }

    @Override
    public String makeNoise() {
        return "Brrr Brrr!";
    }
}
