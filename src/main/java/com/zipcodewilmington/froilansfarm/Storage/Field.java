package com.zipcodewilmington.froilansfarm.Storage;

import java.util.Hashtable;

public class Field {
    private Hashtable<Integer, CropRow> cropField = new Hashtable<Integer, CropRow>();

    public CropRow getCropRow(Integer key) {
        return cropField.get(key);
    }

    public void addCropRow(Integer key, CropRow cropRow) {
        cropField.put(key, cropRow);
    }

    public void removeCropRow(Integer key) {
        cropField.remove(key);
    }

    public int sizeOfField() {
        return cropField.size();
    }
}
