package Interfaces;

public class Jet implements FlightEnabled, Trackable {
    @Override
    public void track() {
        System.out.println(getClass().getSimpleName()+" 's coordinated recorded");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getSimpleName()+" is taking off");
    }

    @Override
    public void land() {
        System.out.println(getClass().getSimpleName()+" is landing");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName()+" is flying");
    }
    @Override
    public FlightStages transition(FlightStages stage){
        System.out.println(getClass().getSimpleName() + " transistioning");
        return FlightEnabled.super.transition(stage);
    }
    
}
