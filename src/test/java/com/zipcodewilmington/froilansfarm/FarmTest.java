package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Food.Tomato;
import com.zipcodewilmington.froilansfarm.Interfaces.Edible;
import com.zipcodewilmington.froilansfarm.Interfaces.Vegetable;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.People.Pilot;
import com.zipcodewilmington.froilansfarm.Storage.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.EdibleStorage;
import com.zipcodewilmington.froilansfarm.Storage.Stable;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmTest {
    Farm farm = new Farm();

    @Test
    public void stables1Test() {
        //Given:
        Stable currentStable = farm.stable1;

        //When:
        int actual = currentStable.sizeOfStable();

        //Then:
        assertEquals(4, actual);
    }

    @Test
    public void stables2Test() {
        //Given:
        Stable currentStable = farm.stable2;

        //When:
        int actual = currentStable.sizeOfStable();

        //Then:
        assertEquals(3, actual);
    }

    @Test
    public void stables3Test() {
        //Given:
        Stable currentStable = farm.stable3;

        //When:
        int actual = currentStable.sizeOfStable();

        //Then:
        assertEquals(3, actual);
    }

    @Test
    public void chickenCoop1Test() {
        //Given:
        ChickenCoop currentCoop = farm.chickenCoop1;

        //When:
        int actual = currentCoop.size();

        //Then:
        assertEquals(4, actual);
    }

    @Test
    public void chickenCoop2Test() {
        //Given:
        ChickenCoop currentCoop = farm.chickenCoop2;

        //When:
        int actual = currentCoop.size();

        //Then:
        assertEquals(4, actual);
    }

    @Test
    public void chickenCoop3Test() {
        //Given:
        ChickenCoop currentCoop = farm.chickenCoop3;

        //When:
        int actual = currentCoop.size();

        //Then:
        assertEquals(4, actual);
    }

    @Test
    public void chickenCoop4Test() {
        //Given:
        ChickenCoop currentCoop = farm.chickenCoop4;

        //When:
        int actual = currentCoop.size();

        //Then:
        assertEquals(3, actual);
    }

    @Test
    public void edibleStorageTest() {
        //Given:
        EdibleStorage<Edible> currentStorage = farm.edibleStorage;

        //When:
        int actual = currentStorage.size();

        //Then:
        assertEquals(300, actual);
    }

    @Test
    public void animalFoodStorageTest() {
        //Given:
        EdibleStorage<Vegetable> currentStorage = farm.animalFoodStorage;

        //When:
        int actual = currentStorage.size();

        //Then:
        assertEquals(200, actual);
    }

    @Test
    public void fieldSizeTest() {
        //Given:

        //When:
        int actual = farm.field.sizeOfField();

        //Then:
        assertEquals(5, actual);
    }

    @Test
    public void field1Test() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(1);

        //When:
        int actual = currentCropRow.sizeOfRow();

        //Then:
        assertEquals(50, actual);
    }

    @Test
    public void field1CropTest() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(1);

        //When:
        Crop crop = currentCropRow.getCrop();

        //Then:
        Assert.assertTrue(crop instanceof CornStalk);
    }

    @Test
    public void field1CropYieldTest() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(1);

        //When:
        Crop crop = currentCropRow.getCrop();
        crop.fertilize();
        Vegetable actual = crop.yield();

        //Then:
        Assert.assertTrue(actual instanceof Corn);
    }

    @Test
    public void field1CropYieldFalseTest() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(1);

        //When:
        Crop crop = currentCropRow.getCrop();
        crop.fertilize();
        Vegetable actual = crop.yield();

        System.out.println(actual);

        //Then:
        Assert.assertFalse(actual instanceof Tomato);
    }

    @Test
    public void field2Test() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(2);

        //When:
        int actual = currentCropRow.sizeOfRow();

        //Then:
        assertEquals(50, actual);
    }

    @Test
    public void field2CropTest() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(2);

        //When:
        Crop crop = currentCropRow.getCrop();

        //Then:
        Assert.assertTrue(crop instanceof TomatoPlant);
    }

    @Test
    public void field2CropYieldTest() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(2);

        //When:
        Crop crop = currentCropRow.getCrop();
        crop.fertilize();
        Vegetable actual = crop.yield();

        //Then:
        Assert.assertTrue(actual instanceof Tomato);
    }

    @Test
    public void field3CropTest() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(3);

        //When:
        Crop crop = currentCropRow.getCrop();

        //Then:
        Assert.assertTrue(crop instanceof CornStalk);
    }

    @Test
    public void tractorTest() {
        //Given:

        //When:
        String actual = farm.tractor.makeNoise();

        //Then:
        assertEquals("Brrr Brrr!", actual);
    }

    @Test
    public void cropDusterTest() {
        //Given:

        //When:
        String actual = farm.cropDuster.makeNoise();

        //Then:
        assertEquals("Eeeeeaaarrrr!", actual);
    }

    @Test
    public void farmHouseFroilanTest() {
        //Given:

        //When:

        //Then:
        assertTrue(farm.farmHouse.getFroilan() instanceof Farmer);
    }

    @Test
    public void farmHouseFroilanFalseTest() {
        //Given:

        //When:

        //Then:
        assertFalse(farm.farmHouse.getFroilan() instanceof Pilot);
    }

    @Test
    public void farmHouseFroilandaFarmerTest() {
        //Given:

        //When:

        //Then:
        assertTrue(farm.farmHouse.getFroilanda() instanceof Farmer);
    }

    @Test
    public void farmHouseFroilandaPilotTest() {
        //Given:

        //When:

        //Then:
        assertTrue(farm.farmHouse.getFroilanda() instanceof Pilot);
    }
}