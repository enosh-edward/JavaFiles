package Interfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Bird bird = new Bird();
        Animal animal = bird;
        FlightEnabled flier=bird;
        Trackable tracked=bird;

        //animal.move();
        //flier.move();
        //tracked.move();

        // flier.takeOff();
        // flier.fly();
        // tracked.track();
        // flier.land();
        //inflight(flier);
        //inflight(new Jet());
        // Truck truck = new Truck();
        // truck.track();
        double kmTraveled = 100;
        double milesTravled = kmTraveled * FlightEnabled.KM_TO_MILES;
        System.out.printf("the truck travled %.2f km or %.2f miles%n",kmTraveled,milesTravled);

        LinkedList<FlightEnabled> fliers = new LinkedList<>();
        fliers.add(bird);
        List<FlightEnabled> betterFliers = new LinkedList<>();
        betterFliers.add(bird);

        triggerFliers(fliers);
        flyFliers(fliers);
        landFliers(fliers);

        triggerFliers(betterFliers);
        flyFliers(betterFliers);
        landFliers(betterFliers);

    }
    public static void inflight(FlightEnabled flier){
        flier.takeOff();
        flier.fly();
        if(flier instanceof Trackable tracked){
            tracked.track();
        }
        flier.land();
    }
    public static void triggerFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.takeOff();
        }
    }
    public static void flyFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.fly();
        }
    }
    public static void landFliers(List<FlightEnabled> fliers){
        for(var flier : fliers){
            flier.land();
        }
    }
}
