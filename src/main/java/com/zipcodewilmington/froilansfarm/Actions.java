package com.zipcodewilmington.froilansfarm;

import com.zipcodewilmington.froilansfarm.Animals.Horse;
import com.zipcodewilmington.froilansfarm.Crops.CornStalk;
import com.zipcodewilmington.froilansfarm.Crops.TomatoPlant;

public class Actions {

    public void rideHorses(Farm farm) {
        for(Horse horse: farm.stable1.getStable()) {
            farm.farmHouse.getFroilan().mount(horse);
            farm.farmHouse.getFroilan().dismount();
            horse.dismounted();
            farm.farmHouse.getFroilanda().mount(horse);
            farm.farmHouse.getFroilanda().dismount();
            horse.dismounted();
        }
        System.out.println(String.format("%s and %s both ride each horse in stable 1 once each", farm.farmHouse.getFroilan().getName(), farm.farmHouse.getFroilanda().getName()));

        for(Horse horse: farm.stable2.getStable()) {
            farm.farmHouse.getFroilan().mount(horse);
            farm.farmHouse.getFroilan().dismount();
            horse.dismounted();
            farm.farmHouse.getFroilanda().mount(horse);
            farm.farmHouse.getFroilanda().dismount();
            horse.dismounted();
        }
        System.out.println(String.format("%s and %s both ride each horse in stable 2 once each", farm.farmHouse.getFroilan().getName(), farm.farmHouse.getFroilanda().getName()));

        for(Horse horse: farm.stable3.getStable()) {
            farm.farmHouse.getFroilan().mount(horse);
            farm.farmHouse.getFroilan().dismount();
            horse.dismounted();
            farm.farmHouse.getFroilanda().mount(horse);
            farm.farmHouse.getFroilanda().dismount();
            horse.dismounted();
        }
        System.out.println(String.format("%s and %s both ride each horse in stable 3 once each", farm.farmHouse.getFroilan().getName(), farm.farmHouse.getFroilanda().getName()));

    }

    public void feedHorses(Farm farm) {
        for(Horse horse : farm.stable1.getStable()) {
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
        }
        System.out.println(String.format("%s feeds each horse 3 times in stable 1", farm.farmHouse.getFroilan().getName()));

        for(Horse horse : farm.stable2.getStable()) {
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
        }
        System.out.println(String.format("%s feeds each horse 3 times in stable 2", farm.farmHouse.getFroilan().getName()));


        for(Horse horse : farm.stable3.getStable()) {
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
            farm.farmHouse.getFroilan().feed(horse, farm.animalFoodStorage.getFood());
        }
        System.out.println(String.format("%s feeds each horse 3 times in stable 3", farm.farmHouse.getFroilan().getName()));
    }

    public void eatBreakfast(Farm farm) {
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilan().eat(farm.edibleStorage.getFood());
        System.out.println(String.format("%s eats 1 Corn, 2 Tomato, 5 Egg for breakfast", farm.farmHouse.getFroilan().getName()));

        farm.farmHouse.getFroilanda().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilanda().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilanda().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilanda().eat(farm.edibleStorage.getFood());
        farm.farmHouse.getFroilanda().eat(farm.edibleStorage.getFood());
        System.out.println(String.format("%s eats 2 Corn, 1 Tomato, 2 Egg for breakfast", farm.farmHouse.getFroilanda().getName()));

    }

    public void froilanPlant(Farm farm) {
        int counter = 0;
        while (counter < 50) {
            farm.farmHouse.getFroilan().plant(new CornStalk(), farm.field.getCropRow(1));
            counter++;
        }
        System.out.println(String.format("Froilan plants %s Corn Stalks in crop row 1", counter));

        int counter2 = 0;
        while (counter2 < 50) {
            farm.farmHouse.getFroilan().plant(new TomatoPlant(), farm.field.getCropRow(2));
            counter2++;
        }
        System.out.println(String.format("Froilan plants %s Tomato Plants in crop row 2", counter));

        int counter3 = 0;
        while (counter3 < 50) {
            farm.farmHouse.getFroilan().plant(new CornStalk(), farm.field.getCropRow(3));
            counter3++;
        }
        System.out.println(String.format("Froilan plants %s Corn Stalks in crop row 3", counter));
    }

    public void froilandaFertilize(Farm farm) {
        farm.farmHouse.getFroilanda().mount(farm.cropDuster);
        System.out.println(String.format("%s gets on the CropDuster.", farm.farmHouse.getFroilanda().getName()));

        farm.cropDuster.operate(farm);
        System.out.println(String.format("%s fertilizes the Field with the CropDuster.", farm.farmHouse.getFroilanda().getName()));

        farm.cropDuster.dismounted();
        System.out.println(String.format("%s gets off the CropDuster.", farm.farmHouse.getFroilanda().getName()));

    }

    public void froilanHarvest(Farm farm) {
        farm.farmHouse.getFroilan().mount(farm.tractor);
        System.out.println(String.format("%s gets on the Tractor.", farm.farmHouse.getFroilan().getName()));

        farm.tractor.operate(farm);
        System.out.println(String.format("%s harvests the Field on the Tractor.", farm.farmHouse.getFroilan().getName()));

        farm.tractor.dismounted();
        System.out.println(String.format("%s gets off the Tractor.", farm.farmHouse.getFroilan().getName()));

    }

    public void farmerNoises(Farm farm) {
        System.out.println(String.format("Froilan screams %s", farm.farmHouse.getFroilan().makeNoise()));
        System.out.println(String.format("Froilanda replies with %s", farm.farmHouse.getFroilanda().makeNoise()));
    }
}
