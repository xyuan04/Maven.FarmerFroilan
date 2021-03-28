package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {
    Farmer froilan = new Farmer("Froilan");
    Tractor tractor = new Tractor();

    @Test
    public void ridingTest() {
        //Given: Above

        //When:
        tractor.riding(froilan);

        //Then:
        Assert.assertTrue(tractor.isMounted());
    }

    @Test
    public void ridingRiderTest() {
        //Given: Above

        //When:
        tractor.riding(froilan);

        //Then:
        Assert.assertTrue(tractor.getCurrentRider() == froilan);
    }

    @Test
    public void operate() {
    }

    @Test
    public void makeNoise() {
        //Given: Above

        //When:
        String actual = tractor.makeNoise();

        //Then:
        Assert.assertTrue(actual.equals("Brrr Brrr!"));
    }
}