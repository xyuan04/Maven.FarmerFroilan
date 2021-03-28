package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;


public class FarmHouse {
    private Farmer froilan = new Farmer("Froilan");
    private Pilot froilanda = new Pilot("Froilanda");

    public Farmer getFroilan() {
        return froilan;
    }

    public Pilot getFroilanda() {
        return froilanda;
    }
}
