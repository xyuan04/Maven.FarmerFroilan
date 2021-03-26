package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Food.Egg;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChickenTest {
    Chicken earnie = new Chicken("Earnie");
    @Test
    public void fertilizeTest() {
        //Given: Above

        //When:
        earnie.fertilize();

        //Then:
        Assert.assertTrue(earnie.hasBeenFertilized() == true);
    }

    @Test
    public void yieldNotFertilizedTest() {
        //Given: Above

        //When:
        Egg egg = earnie.yield();

        //Then:
        Assert.assertTrue(egg == null);
    }

    @Test
    public void yieldFertilizedTest() {
        //Given:
        earnie.fertilize();

        //When:
        Egg egg = earnie.yield();

        //Then:
        Assert.assertTrue(egg instanceof Egg);
    }

    @Test
    public void hasBeenFertilizedFalseTest() {
        //Given: Above

        //When:
        boolean fertilized = earnie.hasBeenFertilized();

        //Then:
        Assert.assertFalse(fertilized);
    }

    @Test
    public void hasBeenFertilizedTrueTest() {
        //Given: Above

        //When:
        earnie.fertilize();

        //Then:
        Assert.assertTrue(earnie.hasBeenFertilized());
    }

    @Test
    public void makeNoiseTest() {
        //Given: Above

        //When:
        String expected = "Cluck!";
        String actual = earnie.makeNoise();

        //Then:
        Assert.assertEquals(expected, actual);
    }
}