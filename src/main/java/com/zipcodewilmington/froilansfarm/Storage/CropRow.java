package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crops.Crop;

import java.util.ArrayList;
import java.util.Iterator;

public class CropRow {
    ArrayList<Crop> crops;

    public CropRow() {
        crops = new ArrayList<Crop>();
    }

    public void addCrop(Crop crop) {
        crops.add(crop);
    }
    
    public Crop getCrop() {
        Iterator<Crop> cropIterator = crops.iterator();
        Crop currentCrop = null;
        while (cropIterator.hasNext()) {
            currentCrop = cropIterator.next();
            cropIterator.remove();
            return currentCrop;
        }
        return null;
    }
    
    public ArrayList<Crop> getCropRow() {
        return crops;
    }

    public int sizeOfRow() {
        return crops.size();
    }

}
