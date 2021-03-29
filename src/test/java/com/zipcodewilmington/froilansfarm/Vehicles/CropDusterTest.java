package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Crops.Crop;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.Interfaces.FarmVehicle;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.Field;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class CropDusterTest {
    Farm farm = new Farm();

    @Test
    public void testOperateNoRider() {
        //Given

        //When
        farm.cropDuster.operate(farm);
        Crop crop = farm.field.getCropRow(1).getCrop();

        //Then
        Assert.assertFalse(crop.hasBeenFertilized());
    }

    @Test
    public void testOperate() {
        //Given

        //When
        farm.farmHouse.getFroilanda().mount(farm.cropDuster);
        farm.cropDuster.operate(farm);
        Crop crop = farm.field.getCropRow(1).getCrop();

        //Then
        Assert.assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void testOperate2() {
        //Given

        //When
        farm.farmHouse.getFroilanda().mount(farm.cropDuster);
        farm.cropDuster.operate(farm);
        Crop crop = farm.field.getCropRow(2).getCrop();

        //Then
        Assert.assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void testOperate3() {
        //Given

        //When
        farm.farmHouse.getFroilanda().mount(farm.cropDuster);
        farm.cropDuster.operate(farm);
        Crop crop = farm.field.getCropRow(3).getCrop();

        //Then
        Assert.assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void testOperate4() {
        //Given

        //When
        farm.farmHouse.getFroilanda().mount(farm.cropDuster);
        farm.cropDuster.operate(farm);
        Crop crop = farm.field.getCropRow(4).getCrop();

        //Then
        Assert.assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void testOperate5() {
        //Given

        //When
        farm.farmHouse.getFroilanda().mount(farm.cropDuster);
        farm.cropDuster.operate(farm);
        Crop crop = farm.field.getCropRow(5).getCrop();

        //Then
        Assert.assertTrue(crop.hasBeenFertilized());
    }

    @Test
    public void testMakeNoise() {
        //Given
        CropDuster cd = new CropDuster();
        Farm farmZero = new Farm();
        //
        cd.operate(farmZero);
        String actual=cd.makeNoise();
        //
        Assert.assertEquals("Eeeeeaaarrrr!",actual);
    }
}