package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Produce<TypeOfFood extends Edible>{

    TypeOfFood yield();

    boolean hasBeenFertilized();

}
