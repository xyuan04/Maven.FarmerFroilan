package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;

public abstract class Person {
    private String name;
    private ArrayList<Edible> foodEaten;
    
    public Person(String name) {
        this.name = name;
        foodEaten = new ArrayList<Edible>();
    }

    public String makeNoise() {
        return "Hello World";
    }

    public void eat(Edible food) {
        foodEaten.add(food);
    }

    public String getName() {
        return name;
    }
}
