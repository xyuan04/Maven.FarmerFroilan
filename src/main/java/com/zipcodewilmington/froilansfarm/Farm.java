package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Egg;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;
import com.zipcodewilmington.froilansfarm.Storage.*;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;

public class Farm {
    public Stable stable1;
    public Stable stable2;
    public Stable stable3;
    public ChickenCoop chickenCoop1;
    public ChickenCoop chickenCoop2;
    public ChickenCoop chickenCoop3;
    public ChickenCoop chickenCoop4;
    public EdibleStorage<Edible> edibleStorage;
    public EdibleStorage<Vegetable> animalFoodStorage;
    public FarmHouse farmHouse;
    public Field field;
    public Tractor tractor;
    public CropDuster cropDuster;

    public Farm() {
        farmHouse = new FarmHouse();
        field = new Field();
        stable1 = new Stable();
        stable2 = new Stable();
        stable3 = new Stable();
        chickenCoop1 = new ChickenCoop();
        chickenCoop2 = new ChickenCoop();
        chickenCoop3 = new ChickenCoop();
        chickenCoop4 = new ChickenCoop();
        edibleStorage = new EdibleStorage<Edible>();
        animalFoodStorage = new EdibleStorage<Vegetable>();
        tractor = new Tractor();
        cropDuster = new CropDuster();

        instantiateAnimals();
        instantiateField();
        instantiateFood();
    }

    public EdibleStorage getEdibleStorage() {
        return edibleStorage;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public Field getField() {
        return field;
    }

    private void instantiateAnimals() {
        int chickenCounter1 = 0;
        while(chickenCounter1 < 4) {
            chickenCoop1.addChicken(new Chicken("Chicken"));
            chickenCounter1++;
        }

        int chickenCounter2 = 0;
        while(chickenCounter2 < 4) {
            chickenCoop2.addChicken(new Chicken("Chicken"));
            chickenCounter2++;
        }

        int chickenCounter3 = 0;
        while(chickenCounter3 < 4) {
            chickenCoop3.addChicken(new Chicken("Chicken"));
            chickenCounter3++;
        }

        int chickenCounter4 = 0;
        while(chickenCounter4 < 3) {
            chickenCoop4.addChicken(new Chicken("Chicken"));
            chickenCounter4++;
        }

        int horseCounter1 = 0;
        while(horseCounter1 < 4) {
            stable1.addHorse(new Horse("Horse"));
            horseCounter1++;
        }

        int horseCounter2 = 0;
        while(horseCounter2 < 3) {
            stable2.addHorse(new Horse("Horse"));
            horseCounter2++;
        }

        int horseCounter3 = 0;
        while(horseCounter3 < 3) {
            stable3.addHorse(new Horse("Horse"));
            horseCounter3++;
        }
    }

    public void instantiateFood() {
        int counter = 0;
        while (counter < 100) {
            edibleStorage.addFood(new Egg());
            edibleStorage.addFood(new Tomato());
            edibleStorage.addFood(new Egg());
            counter++;
        }

        int animalCounter = 0;
        while (animalCounter < 100) {
            animalFoodStorage.addFood(new Corn());
            animalFoodStorage.addFood(new Tomato());
            animalCounter++;
        }
    }

    public void instantiateField() {
        field.addCropRow(1, new CropRow());
        field.addCropRow(2, new CropRow());
        field.addCropRow(3, new CropRow());
        field.addCropRow(4, new CropRow());
        field.addCropRow(5, new CropRow());


        for(int i = 1; i <= 5; i++) {
            int counter = 0;
            if(i % 2 != 0) {
                while(counter < 50) {
                    field.getCropRow(i).addCrop(new CornStalk());
                    counter++;
                }
            }
            if(i % 2 == 0) {
                while(counter < 50) {
                    field.getCropRow(i).addCrop(new TomatoPlant());
                    counter++;
                }
            }
        }
    }
}
