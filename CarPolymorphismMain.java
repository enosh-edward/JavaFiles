public class CarPolymorphismMain{

    public static void main(String args[]){

        CarPolymorphism model=new CarPolymorphism();
        model.drive();
        CarPolymorphism ferrari=new GasPoweredCar();
        ferrari.drive();

    }
}
