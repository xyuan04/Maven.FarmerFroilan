package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class ChickenCoopTest {
    @Test
    public void testGetChickenCoop() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken leya = new Chicken("Leya");
        Chicken bigBird = new Chicken("Big Bird");

        //When
        chickenCoop.addChicken(leya);
        chickenCoop.addChicken(bigBird);

        //Then
        Assert.assertTrue(chickenCoop.getSize()==2);

    }
    @Test
    public void testAddChicken() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken leya = new Chicken("Leya");
        Chicken bigBird = new Chicken("Big Bird");

        //When
        chickenCoop.addChicken(leya);
        chickenCoop.addChicken(bigBird);

        //Then
        Assert.assertTrue(chickenCoop.getSize()==2);
    }
    @Test
    public void testRemoveChicken() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken leya = new Chicken("Leya");
        Chicken bigBird = new Chicken("Big Bird");

        //When
        chickenCoop.addChicken(leya);
        chickenCoop.addChicken(bigBird);
        chickenCoop.removeChicken(bigBird);

        //Then
        Assert.assertTrue(chickenCoop.getSize()==1);
    }
    @Test
    public void testGetChicken() {
        //Given
        ChickenCoop chickenCoop = new ChickenCoop();
        Chicken leya = new Chicken("Leya");
        Chicken bigBird = new Chicken("Big Bird");

        //When
        chickenCoop.addChicken(leya);
        chickenCoop.addChicken(bigBird);

        //Then
        Assert.assertEquals(leya,chickenCoop.getChicken());
    }
}