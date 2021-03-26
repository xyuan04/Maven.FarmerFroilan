package com.zipcodewilmington.froilansfarm.Animals;

import com.zipcodewilmington.froilansfarm.Interfaces.Rider;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {
    Horse seaBiscuit = new Horse("Sea Biscuit");

    @Test
    public void getTimesRodeTest() {
        //Given: Above

        //When:
        int expected = 0;
        int actual = seaBiscuit.getTimesRode();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTimesRodeWithRiderTest() {
        //Given:
        Rider frolian = new Farmer("Froilan");

        //When:
        seaBiscuit.riding(frolian);
        int expected = 1;
        int actual = seaBiscuit.getTimesRode();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ridingTest() {
        //Given:
        Rider frolian = new Farmer("Froilan");

        //When:
        seaBiscuit.riding(frolian);
        Rider expected = frolian;
        Rider actual = seaBiscuit.getCurrentRider();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mountedTest() {
        //Given:
        seaBiscuit.mounted();

        //When:
        boolean expected = true;
        boolean actual = seaBiscuit.isMounted();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountedTrueTest() {
        //Given:
        Rider frolian = new Farmer("Froilan");

        //When:
        seaBiscuit.riding(frolian);
        seaBiscuit.dismounted();
        boolean expected = false;
        boolean actual = seaBiscuit.isMounted();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dismountedRiderTest() {
        //Given:
        Rider frolian = new Farmer("Froilan");

        //When:
        seaBiscuit.riding(frolian);
        seaBiscuit.dismounted();
        Rider expected = null;
        Rider actual = seaBiscuit.getCurrentRider();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isMountedNoRiderTest() {
        //Given: Above

        //When:
        boolean actual = seaBiscuit.isMounted();

        assertFalse(actual);
    }

    @Test
    public void isMountedRiderTest() {
        //Given:
        Rider frolian = new Farmer("Froilan");

        //When:
        seaBiscuit.riding(frolian);
        boolean expected = true;
        boolean actual = seaBiscuit.isMounted();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest() {
        //Given: Above

        //When:
        String expected = "Neigh!";
        String actual = seaBiscuit.makeNoise();

        //Then:
        assertEquals(expected, actual);
    }
}