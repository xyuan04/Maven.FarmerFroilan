package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Interfaces.Edible;

import java.util.ArrayList;
import java.util.Iterator;

public class EdibleStorage<TypeOfFood extends Edible> {
    private ArrayList<TypeOfFood> edibleStorage;

    public EdibleStorage() {
        edibleStorage = new ArrayList<TypeOfFood>();
    }

    public ArrayList<TypeOfFood> getEdibleStorage() {
        return edibleStorage;
    }

    public void addFood(TypeOfFood edible) {
        edibleStorage.add(edible);
    }

    public void removeFood(TypeOfFood edible) {
        edibleStorage.remove(edible);
    }

    public TypeOfFood getFood() {
        Iterator<TypeOfFood> iterator = edibleStorage.iterator();

        return iterator.next();
    }

    public int size() {
        return edibleStorage.size();
    }
}
