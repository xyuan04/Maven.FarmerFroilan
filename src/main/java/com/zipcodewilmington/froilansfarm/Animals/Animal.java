package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Eater;
import com.zipcodewilmington.froilansfarm.Interfaces.NoiseMaker;
import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;

import java.util.ArrayList;
import java.util.List;

public abstract class Animal implements Eater<Vegetable>, NoiseMaker {
    private String type;
    private List<Vegetable> foodEaten = new ArrayList<Vegetable>();

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public void eat(Vegetable food) {
        foodEaten.add(food);
    }
    
    public int howMuchFoodEaten() {
        return foodEaten.size();
    }

    public void clearFood() {
        foodEaten.clear();
    }

    public List<Vegetable> getFoodEaten() {
        return foodEaten;
    }

    public String makeNoise() {
        return "Noise";
    }

}
