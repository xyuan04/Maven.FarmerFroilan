package com.zipcodewilmington.froilansfarm;

public interface Produce<TypeOfFood extends Edible>{

    TypeOfFood yield();

    boolean hasBeenFertilized();

}
