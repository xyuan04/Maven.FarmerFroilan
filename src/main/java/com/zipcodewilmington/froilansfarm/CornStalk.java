package com.zipcodewilmington.froilansfarm;

public class CornStalk extends Crop {

    public Vegetable yield() {
        return new Corn();
    }

}
