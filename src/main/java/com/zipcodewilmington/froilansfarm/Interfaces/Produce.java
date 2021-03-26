package com.zipcodewilmington.froilansfarm.Interfaces;

import com.zipcodewilmington.froilansfarm.People.Farmer;

public interface Produce<TypeOfFood extends Edible>{

    TypeOfFood yield();

    boolean hasBeenFertilized();

    void fertilize();

}
