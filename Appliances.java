public class Appliances{
}
class Refrigerator extends Appliances{
    private boolean hasWorkToDO;

    public Refrigerator(){}
    public Refrigerator(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }
    private void orderFood(){
        if(hasWorkToDO)
        System.out.println("Food has been ordered..");
    }
    public void doKitchenWork(){
        orderFood();
    }
}
class DishWasher extends Appliances{
    private boolean hasWorkToDO;

    public DishWasher(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }
    private void doDishes(){
        if(hasWorkToDO)
        System.out.println("Dishe cleaning started...");
    }
    public void doKitchenWork(){
        doDishes();
    }
}
class CoffeeMaker extends Appliances{
    private boolean hasWorkToDO;

    public CoffeeMaker(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }
    private void brewCoffee(){
        if(hasWorkToDO)
        System.out.println("Coffee brewing...");
    }
    public void doKitchenWork(){
        brewCoffee();
    }
}

