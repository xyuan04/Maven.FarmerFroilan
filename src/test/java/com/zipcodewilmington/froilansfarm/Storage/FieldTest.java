package com.zipcodewilmington.froilansfarm.Storage;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Hashtable;

public class FieldTest {

    @Test
    public void testGetCropRow() {
        //Given
        Field fieldZero = new Field();
        CropRow cropRowZero = new CropRow();

        //When
        fieldZero.addCropRow(0,cropRowZero);
        CropRow actual = fieldZero.getCropRow(0);

        //Then
        Assert.assertEquals(cropRowZero,actual);

    }

    @Test
    public void testAddCropRow() {
        //Given
        Field fieldZero = new Field();
        CropRow cropRowZero = new CropRow();

        //When
        fieldZero.addCropRow(0,cropRowZero);
        CropRow actual = fieldZero.getCropRow(0);

        //Then
        Assert.assertEquals(cropRowZero,actual);
    }

    @Test
    public void testRemoveCropRow() {
        //Given
        Field fieldZero = new Field();
        CropRow cropRowZero = new CropRow();
        CropRow cropRowOne = new CropRow();

        //When
        fieldZero.addCropRow(0,cropRowZero);
        fieldZero.addCropRow(1,cropRowOne);
        fieldZero.removeCropRow(0);
        CropRow actual = fieldZero.getCropRow(1);

        //Then
        Assert.assertEquals(cropRowOne,actual);
    }

    @Test
    public void testSizeOfField() {
        //Given
        Field fieldZero = new Field();
        CropRow cropRowZero = new CropRow();
        CropRow cropRowOne = new CropRow();

        //When
        fieldZero.addCropRow(0,cropRowZero);
        fieldZero.addCropRow(1,cropRowOne);
        int expected = 2;
        int actual = fieldZero.sizeOfField();

        //Then
        Assert.assertEquals(expected, actual);

    }
}