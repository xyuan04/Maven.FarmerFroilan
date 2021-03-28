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
//    @Test
//    public void testOperate() {
//        //Given
//        Farm farmZero = new Farm();
//        CropDuster cd = new CropDuster();
//
//        //
//        cd.operate(farmZero);
//        Field current=farmZero.getField();
//        System.out.println(current);
//        CropRow cr=current.getCropRow(2);
//
//
//        //Crop crop=current.getCrop();
//
//        //
//        Assert.assertTrue(cr.getCrop().hasBeenFertilized());
//    }
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