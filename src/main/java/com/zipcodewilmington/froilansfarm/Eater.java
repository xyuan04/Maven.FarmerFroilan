package com.zipcodewilmington.froilansfarm;

public interface Eater<TypeOfFood extends Edible> {

    void eat(TypeOfFood food);

}
