public class CarPolymorphismChallenge {
    // write code here
    private boolean engine=true;
    private int cylinders;
    private String name;
    private int wheels=4;;
    public CarPolymorphismChallenge(){
        
    }
    public CarPolymorphismChallenge(int cylinders,String name){
        this.cylinders=cylinders;
        this.name=name;
    }
    public String startEngine(){
        return "the car's engine is starting "+getClass().getSimpleName();
    }
    public String accelerate(){
        return "the car is accelerating "+getClass().getSimpleName();
    }
    public String brake(){
        return "the car is barking "+getClass().getSimpleName();
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }
}
class Mitsubishi extends CarPolymorphismChallenge{
    // write code here
    public Mitsubishi(){
        super();
    }
    public Mitsubishi(int cylinders,String name){
        super(cylinders,name);
    }
    public String startEngine(){
        return super.startEngine();
    }
    public String accelerate(){
        return super.accelerate();
    }
    public String brake(){
        return super.brake();
    }
}
class Holden extends CarPolymorphismChallenge{
    // write code here
    public Holden(){
        super();
    }
    public Holden(int cylinders,String name){
        super(cylinders,name);
    }
    public String startEngine(){
        return super.startEngine();
    }
    public String accelerate(){
        return super.accelerate();
    }
    public String brake(){
        return super.brake();
    }
}
class Ford extends CarPolymorphismChallenge{
    // write code here
    public Ford(){
        super();
    }
    public Ford(int cylinders,String name){
        super(cylinders,name);
    }
    public String startEngine(){
        return super.startEngine();
    }
    public String accelerate(){
        return super.accelerate();
    }
    public String brake(){
        return super.brake();
    }
}
