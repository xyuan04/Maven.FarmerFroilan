package com.zipcodewilmington.froilansfarm.People;

import com.zipcodewilmington.froilansfarm.Animals.Chicken;
import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;
import com.zipcodewilmington.froilansfarm.Food.Corn;
import com.zipcodewilmington.froilansfarm.Storage.CropRow;
import com.zipcodewilmington.froilansfarm.Vehicles.CropDuster;
import com.zipcodewilmington.froilansfarm.Vehicles.Tractor;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FarmerTest {
    Farmer froilan = new Farmer("Froilan");

    @Test
    public void getNameTest() {
        //Given: Above

        //When:
        String expected = "Froilan";
        String actual = froilan.getName();

        //Then:
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void plantTest() {
        //Given:
        CropRow cropRow = new CropRow();
        CornStalk cornStalk = new CornStalk();
        TomatoPlant tomatoPlant = new TomatoPlant();

        //When:
        froilan.plant(cornStalk, cropRow);
        froilan.plant(tomatoPlant, cropRow);

        //Then:
        Assert.assertTrue(cropRow.sizeOfRow() == 2);
    }

    @Test
    public void mountHorseTest() {
        //Given:
        Horse seasbiscuit = new Horse("Seabiscuit");

        //When:
        froilan.mount(seasbiscuit);

        //Then:
        Assert.assertTrue(froilan.getCurrentlyRiding() == seasbiscuit);
    }

    @Test
    public void mountTractorTest() {
        //Given:
        Tractor tractor = new Tractor();

        //When:
        froilan.mount(tractor);

        //Then:
        Assert.assertTrue(froilan.getCurrentlyRiding() == tractor);
    }

    @Test
    public void mountDustTest() {
        //Given:
        CropDuster duster = new CropDuster();

        //When:
        froilan.mount(duster);

        //Then:
        Assert.assertTrue(froilan.getCurrentlyRiding() == duster);
    }

    @Test
    public void fertilizeProduceTest() {
        //Given:
        Chicken chicken = new Chicken("chick");

        //When:
        froilan.fertilizeProduce(chicken);

        //Then:
        Assert.assertTrue(chicken.hasBeenFertilized());
    }

    @Test
    public void fertilizeProduceFalseTest() {
        //Given:
        Chicken chicken = new Chicken("chick");

        //When:

        //Then:
        Assert.assertFalse(chicken.hasBeenFertilized());
    }

    @Test
    public void fertilizeProduceCornTest() {
        //Given:
        CornStalk cornStalk = new CornStalk();

        //When:
        froilan.fertilizeProduce(cornStalk);

        //Then:
        Assert.assertTrue(cornStalk.hasBeenFertilized());
    }

    @Test
    public void dismountTest() {
        //Given:
        Tractor tractor = new Tractor();

        //When:
        froilan.mount(tractor);
        froilan.dismount();

        //Then:
        Assert.assertTrue(froilan.getCurrentlyRiding() == null);
    }

    @Test
    public void feedTest() {
        //Given:
        Horse horse = new Horse("horse");
        Corn corn = new Corn();
        Corn corn2 = new Corn();

        //When:
        froilan.feed(horse, corn);
        froilan.feed(horse, corn2);

        //Then:
        Assert.assertTrue(horse.howMuchFoodEaten() == 2);
    }

    @Test
    public void makeNoiseTest() {
        //Given: Above

        //When:
        String acutal = froilan.makeNoise();

        //Then:
        Assert.assertTrue(acutal.equals("YEEEHAW!"));
    }
}