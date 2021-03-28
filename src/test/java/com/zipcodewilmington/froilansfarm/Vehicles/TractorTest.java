package com.zipcodewilmington.froilansfarm.Vehicles;

import com.zipcodewilmington.froilansfarm.Farm;
import com.zipcodewilmington.froilansfarm.People.Farmer;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Storage.EdibleStorage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TractorTest {
    Farmer froilan = new Farmer("Froilan");
    Tractor tractor = new Tractor();
    Farm farm = new Farm();

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
    public void operateNotFertilizedTest() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(1);

        //When:
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(50, currentCropRow.sizeOfRow());
    }

    @Test
    public void operate1Test() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(1);
        farm.getFarmHouse().getFroilan().mount(tractor);
        farm.getFarmHouse().getFroilanda().mount(farm.cropDuster);

        //When:
        farm.cropDuster.operate(farm);
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(0, currentCropRow.sizeOfRow());
    }

    @Test
    public void operate2Test() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(2);
        farm.getFarmHouse().getFroilan().mount(tractor);
        farm.getFarmHouse().getFroilanda().mount(farm.cropDuster);

        //When:
        farm.cropDuster.operate(farm);
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(0, currentCropRow.sizeOfRow());
    }

    @Test
    public void operate3Test() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(3);
        farm.getFarmHouse().getFroilan().mount(tractor);
        farm.getFarmHouse().getFroilanda().mount(farm.cropDuster);

        //When:
        farm.cropDuster.operate(farm);
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(0, currentCropRow.sizeOfRow());
    }
    @Test
    public void operate4Test() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(4);
        farm.getFarmHouse().getFroilan().mount(tractor);
        farm.getFarmHouse().getFroilanda().mount(farm.cropDuster);

        //When:
        farm.cropDuster.operate(farm);
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(0, currentCropRow.sizeOfRow());
    }

    @Test
    public void operate5Test() {
        //Given:
        CropRow currentCropRow = farm.field.getCropRow(5);
        farm.getFarmHouse().getFroilan().mount(tractor);
        farm.getFarmHouse().getFroilanda().mount(farm.cropDuster);

        //When:
        farm.cropDuster.operate(farm);
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(0, currentCropRow.sizeOfRow());
    }

    @Test
    public void operateEdibleStorageNotFertilizedTest() {
        //Given:
        EdibleStorage currentStorage = farm.edibleStorage;

        //When:
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(300, currentStorage.size());
    }

    @Test
    public void operateEdibleStorageFertilizedTest() {
        //Given:
        EdibleStorage currentStorage = farm.edibleStorage;
        farm.getFarmHouse().getFroilan().mount(tractor);
        farm.getFarmHouse().getFroilanda().mount(farm.cropDuster);

        //When:
        farm.cropDuster.operate(farm);
        tractor.operate(farm);

        //Then:
        Assert.assertEquals(550, currentStorage.size());
    }

    @Test
    public void makeNoiseTest() {
        //Given: Above

        //When:
        String actual = tractor.makeNoise();

        //Then:
        Assert.assertTrue(actual.equals("Brrr Brrr!"));
    }
}