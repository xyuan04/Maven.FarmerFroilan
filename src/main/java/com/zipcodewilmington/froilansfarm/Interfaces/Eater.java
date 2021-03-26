package com.zipcodewilmington.froilansfarm.Interfaces;

public interface Eater<TypeOfFood extends Edible> {

    void eat(TypeOfFood food);

}
