package Interfaces;

/* NOTE : Both records and enums can implement interfaces */
enum FlightStages implements Trackable{
    GROUNDED,LAUNCH,CRUISE,DATA_COLLECTION;
    public void track(){
        if(this != GROUNDED){
            System.out.println("Monitoring "+this);
        }
    }
    public FlightStages getNexStage(){
        FlightStages[] allStages=values();
        return allStages[(ordinal() + 1)%allStages.length];
    }
}
record DragonFly(String name,String type) implements FlightEnabled{

    @Override
    public void takeOff() {
            }

    @Override
    public void land() {
            }

    @Override
    public void fly() {
            }
    
}
class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;

    public void achieveOrbit(){
        transition("Orbit Achieved");
    }

    @Override
    public void takeOff() {
        transition("Taking Off");
            }

    @Override
    public void land() {
        transition("Landing");
            }

    @Override
    public void fly() {
        achieveOrbit();
        transition("Data collection while Orbiting");
            }
    public void transition(String description){
        System.out.println(description);
        stage=transition(stage);
        stage.track();
    }
}
interface OrbitEarth extends FlightEnabled{
    void achieveOrbit();

    static void log(String description){
        var today = new java.util.Date();
        System.out.println(today +": "+description);
    }
    private void logStage(FlightStages stage,String description){
        description = stage +": "+description;
        log(description);
    }
    @Override
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStage(stage, "Beginning Transition to "+ nextStage);
        return nextStage;
    }
}
interface FlightEnabled{

    double MILES_TO_KM=1.60934;
    double KM_TO_MILES=0.621371;
    /*A field declared on an interaface is always public,static and final, so above values are default public static final double MILES_TO_KM */

    public abstract void takeOff();//abstract modifier her is unnecessary and redudant meaning unnecessary to declare
    abstract void land();//abstract modifier is redundant,meaning unnecessary to declare ""NOTE : using protected as modifier raises an error for methods in intereface
    void fly();//this is preferred declaration, public and abstract are implied

    default FlightStages transition(FlightStages stage){
        // System.out.println("transition not implemented on "+getClass().getName());
        // return null;
        FlightStages nextStage= stage.getNexStage();
        System.out.println("Transistioning from "+stage+" to "+nextStage);
        return nextStage;
    }
}
interface Trackable{
    void track();
}
public abstract class Animal {
    public abstract void move();
}
