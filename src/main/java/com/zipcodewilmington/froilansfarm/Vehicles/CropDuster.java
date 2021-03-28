package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Field;

public class CropDuster extends Aircraft implements FarmVehicle {
    private Farm currentFarm;

    public CropDuster() {
        super("CropDuster");
    }

    public void operate(Farm farm) {
        currentFarm = farm;
        Field currentField = currentFarm.getField();

        for(int i = 1; i <= currentField.sizeOfField(); i++) {
            CropRow currentCropRow = currentField.getCropRow(i);
            for (int j = 0; j < currentCropRow.sizeOfRow(); j++) {
                currentCropRow.crops.get(j).fertilize();
            }
        }
    }

    @Override
    public String makeNoise() {
        return "Eeeeeaaarrrr!";
    }
}
