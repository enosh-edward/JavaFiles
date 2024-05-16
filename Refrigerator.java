class Refrigerator {
    private boolean hasWorkToDO;

    public Refrigerator(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }
    private void orderFood(){
        System.out.println("Food has been ordered..");
    }
}
class DishWater {
    private boolean hasWorkToDO;

    public DishWater(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }
    private void doDishes(){
        System.out.println("Dishe cleaning started...");
    }
}
class CoffeeMaker {
    private boolean hasWorkToDO;

    public CoffeeMaker(boolean hasWorkToDO){
        this.hasWorkToDO=hasWorkToDO;
    }
    private void brewCoffee(){
        System.out.println("Coffee brewing...");
    }
}

