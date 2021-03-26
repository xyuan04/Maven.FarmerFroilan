package com.zipcodewilmington.froilansfarm.Crops;

import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CornStalkTest {
    CornStalk corny = new CornStalk();

    @Test
    public void yieldNullTest() {
        //Given: Above

        //When:
        Vegetable actual = corny.yield();

        //Then:
        assertTrue(actual == null);
    }

    @Test
    public void yielCornTest() {
        //Given: Above

        //When:
        corny.fertilize();
        Vegetable actual = corny.yield();

        //Then:
        assertTrue(actual instanceof Corn);
    }

    @Test
    public void fertilizeTest() {
        //Given: Above

        //When:
        corny.fertilize();

        //Then:
        assertTrue(corny.hasBeenFertilized());
    }

    @Test
    public void hasBeenFertilized() {
        //Given: Above

        //When:

        //Then:
        assertFalse(corny.hasBeenFertilized());
    }

    @Test
    public void harvest() {
    }

    @Test
    public void hasBeenHarvested() {
    }
}