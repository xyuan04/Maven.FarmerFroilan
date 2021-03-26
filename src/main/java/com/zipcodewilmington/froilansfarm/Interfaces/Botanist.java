package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;

public interface Botanist {
    void plant(Crop crop, CropRow cropRow);
}
