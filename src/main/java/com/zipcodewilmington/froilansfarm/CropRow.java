package com.zipcodewilmington.froilansfarm;

import java.util.Stack;

public class CropRow {
    Stack<Crop> crops;

    public CropRow() {
        crops = new Stack<Crop>();
    }

    public void addCrop(Crop crop) {
        crops.push(crop);
    }
    
    public Crop removeCrop() {
        return crops.pop();
    }
    
    public Stack<Crop> getCrops() {
        return crops;
    }

    public int sizeOfRow() {
        return crops.size();
    }

}
