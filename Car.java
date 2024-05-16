public class Car {
    private boolean engine=true;
    private int cylinders;
    private String name;
    private int wheels=4;;
    public Car(){

    }
    public Car(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
    }
    public void startEngine(){
        System.out.println("the car's engine is starting"+getClass().getSimpleName());
    }
    public void accelerate(){
        System.out.println("the car is accelerating"+getClass().getSimpleName());
    }
    public void brake(){
        System.out.println("the car is barking"+getClass().getSimpleName());
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
}
