package com.zipcodewilmington.froilansfarm;

public class Simulation {
    Farm farm = new Farm();
    Actions actions = new Actions();

    public void runSimulation() {
        System.out.println("Today is SUNDAY and currently on Froilan's Farm\n");
        actions.rideHorses(farm);
        actions.feedHorses(farm);
        actions.eatBreakfast(farm);
        actions.froilanPlant(farm);
        System.out.println("The day comes to a close.\n");

        System.out.println("Today is MONDAY and currently on Froilan's Farm\n");
        actions.rideHorses(farm);
        actions.feedHorses(farm);
        actions.eatBreakfast(farm);
        actions.froilandaFertilize(farm);
        System.out.println("The day comes to a close.\n");

        System.out.println("Today is TUESDAY and currently on Froilan's Farm\n");
        actions.rideHorses(farm);
        actions.feedHorses(farm);
        actions.eatBreakfast(farm);
        actions.froilanHarvest(farm);
        System.out.println("The day comes to a close.\n");

        System.out.println("Today is WEDNESDAY and currently on Froilan's Farm\n");
        actions.rideHorses(farm);
        actions.feedHorses(farm);
        actions.eatBreakfast(farm);
        actions.farmerNoises(farm);
        System.out.println("The day comes to a close.\n");

        System.out.println("Today is THURSDAY and currently on Froilan's Farm\n");
        actions.rideHorses(farm);
        actions.feedHorses(farm);
        actions.eatBreakfast(farm);
        actions.farmerNoises(farm);
        System.out.println("The day comes to a close.\n");

        System.out.println("Today is FRIDAY and currently on Froilan's Farm\n");
        actions.rideHorses(farm);
        actions.feedHorses(farm);
        actions.eatBreakfast(farm);
        actions.farmerNoises(farm);
        System.out.println("The day comes to a close.\n");

        System.out.println("Today is SATURDAY and currently on Froilan's Farm\n");
        actions.rideHorses(farm);
        actions.feedHorses(farm);
        actions.eatBreakfast(farm);
        actions.farmerNoises(farm);
        System.out.println("The day comes to a close.\n");

        System.out.println("A week have passed, Froilan and Froilanda will start a new week with the same rigorous schedule.");

    }

}
