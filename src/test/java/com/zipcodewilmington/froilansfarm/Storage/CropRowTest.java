package com.zipcodewilmington.froilansfarm.Storage;

import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class CropRowTest {

    @Test
    public void testAddCrop() {
        //Given
        CropRow cropRowZero = new CropRow();
        Crop cropZero = new CornStalk();

        //When
        cropRowZero.addCrop(cropZero);
        Crop actual = cropRowZero.getCrop();

        //Then
        Assert.assertEquals(cropZero,actual);

    }

    @Test
    public void testGetCrop() {
        //Given
        CropRow cropRowZero = new CropRow();
        Crop cropZero = new CornStalk();

        //When
        cropRowZero.addCrop(cropZero);
        Crop actual = cropRowZero.getCrop();

        //Then
        Assert.assertEquals(cropZero,actual);

    }

    @Test
    public void testGetCropRow() {
        //Given
        CropRow cropRowZero = new CropRow();
        ArrayList<Crop> expected = new ArrayList<Crop>();
        Crop cropZero = new CornStalk();
        Crop cropOne = new TomatoPlant();

        //When
        cropRowZero.addCrop(cropZero);
        cropRowZero.addCrop(cropOne);

        expected.add(cropZero);
        expected.add(cropOne);
        ArrayList<Crop> actual = cropRowZero.getCropRow();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSizeOfRow() {

        //Given
        CropRow cropRowZero = new CropRow();
        Crop cropZero = new CornStalk();
        Crop cropOne = new TomatoPlant();

        //When
        cropRowZero.addCrop(cropZero);
        cropRowZero.addCrop(cropOne);
        int expected= 2;
        int actual = cropRowZero.sizeOfRow();

        //Then
        Assert.assertEquals(expected,actual);
    }

}