package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class FarmHouseTest{

    @Test
    public void testGetFarmHouse() {
        //Given
        FarmHouse farmHouse = new FarmHouse();

        //When

        //Then
        Assert.assertTrue(farmHouse.getFroilan() instanceof Farmer);
    }

    @Test
    public void testGetFarmHouseFroilanName() {
        //Given
        FarmHouse farmHouse = new FarmHouse();

        //When
        String expected = "Froilan";
        String actual = farmHouse.getFroilan().getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetFroilanda() {
        //Given
        FarmHouse farmHouse = new FarmHouse();

        //When

        //Then
        Assert.assertTrue(farmHouse.getFroilanda() instanceof Pilot);
    }

    @Test
    public void testGetFroilandaGetName() {
        //Given
        FarmHouse farmHouse = new FarmHouse();

        //When
        String expected = "Froilanda";
        String actual = farmHouse.getFroilanda().getName();

        //Then
        Assert.assertEquals(expected, actual);
    }

}