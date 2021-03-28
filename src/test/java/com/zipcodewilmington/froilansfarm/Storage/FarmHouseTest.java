package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Person;
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
    public void testGetFroilanda() {
        //Given
        FarmHouse farmHouse = new FarmHouse();

        //When

        //Then
        Assert.assertTrue(farmHouse.getFroilanda() instanceof Farmer);
    }

}