package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.People.Person;

import java.util.ArrayList;
import java.util.Iterator;

public class FarmHouse {
    private ArrayList<Person> farmHouse;

    public FarmHouse() {
        farmHouse = new ArrayList<Person>();
    }

    public ArrayList<Person> getFarmHouse() {
        return farmHouse;
    }

    public void addPerson(Person person) {
        farmHouse.add(person);
    }

    public void removePerson(Person person) {
        farmHouse.remove(person);
    }

    public Person getPerson(String name) {
        Iterator<Person> iterator = farmHouse.iterator();
        if(iterator.hasNext()) {
            if(iterator.next().getName().equals(name)) {
                return iterator.next();
            }
        }
        return null;
    }
}
