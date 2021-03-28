package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class StableTest {
    @Test
    public void testGetStable() {
        //Given
        Stable stableZero = new Stable();
        Horse bella = new Horse ("Bella");
        Horse star = new Horse ("Star");
        Horse good = new Horse("Good");

        //When
        stableZero.addHorse(bella);
        stableZero.addHorse(star);
        stableZero.addHorse(good);

        //Then
        Assert.assertTrue(stableZero.getSize()==3);

    }
    @Test
    public void testAddHorse() {
        //Given
        Stable stableZero = new Stable();
        Horse expected = new Horse("Star");

        //When
        stableZero.addHorse(expected);
        Horse actual = stableZero.getHorse();

        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void testRemoveHorse() {
        //Given
        Stable stableZero = new Stable();
        Horse horseZero = new Horse("Star");
        Horse horseOne = new Horse("Bella");

        //When
        stableZero.addHorse(horseZero);
        stableZero.addHorse(horseOne);
        stableZero.removeHorse(horseZero);
        Horse actual = stableZero.getHorse();

        //Then
        Assert.assertEquals(horseOne,actual);


    }
    @Test
    public void testGetHorse() {
        //Given
        Stable stableZero = new Stable();
        Horse expected = new Horse("Star");

        //When
        stableZero.addHorse(expected);
        Horse actual = stableZero.getHorse();

        //Then
        Assert.assertEquals(expected,actual);
    }
}