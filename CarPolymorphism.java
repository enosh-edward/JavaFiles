public class CarPolymorphism {
    String description;
    public void startEngine(){
        System.out.println("Engine Starting..");
    }
    public void drive(){
        System.out.println("this type is "+getClass().getSimpleName());
        runEngine();
    }
    protected void runEngine(){
        System.out.println("Engine from base running..");
    }
}
class GasPoweredCar extends CarPolymorphism{
    double avgKmPerLitre;
    int cylinder;
    public void startEngine(){
        System.out.println("GasPoweredCar Engine Starting..");
    }
    protected void runEngine(){
        System.out.println("sub class runEngine");
     }
}
// class ElectricCar extends CarPolymorphism{
//     double avgKmPerLitre;
//     int batterySize;
//     public void startEngine(){
//         System.out.println("ElectricCar Engine Starting..");
//     }
//     public void drive(){
//         System.out.println("ElectricCar initiating drive..");
//     }
// }
// class HybridCar extends CarPolymorphism{
//     double avgKmPerLitre;
//     int batterySize;
//     int cylinder;
//     public void startEngine(){
//         System.out.println("Hybrid Car Engine Starting..");
//     }
//     public void drive(){
//         System.out.println("Hybrid Car initiating drive..");
//     }
// }

