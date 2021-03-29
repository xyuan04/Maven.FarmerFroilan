package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TomatoPlantTest{
    TomatoPlant tomato = new TomatoPlant();

    @Test
    public void fertilizeTest() {
        //Given: Above
        //When:
        tomato.fertilize();
        //Then:
        assertTrue(tomato.hasBeenFertilized());
    }
    @Test
    public void hasBeenFertilized() {
        //Given: Above
        //When:
        //Then:
        assertFalse(tomato.hasBeenFertilized());
    }

    @Test
    public void yieldNullTest() {
        //Given: Above

        //When:
        Vegetable actual = tomato.yield();

        //Then:
        assertTrue(actual == null);
    }

    @Test
    public void yieldTomatoTest() {
        //Given: Above

        //When:
        tomato.fertilize();
        Vegetable actual = tomato.yield();

        //Then:
        assertTrue(actual instanceof Tomato);
    }

    @Test
    public void harvest() {
        //Given: Above

        //When:
        tomato.harvest();

        //Then:
        assertTrue(tomato.hasBeenHarvested());
    }

    @Test
    public void hasBeenHarvested() {
        //Given: Above

        //When:

        //Then:
        assertFalse(tomato.hasBeenHarvested());
    }

}