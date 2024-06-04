public class Horse extends Mammal{

    public Horse(String type, String size, double weight) {
        super(type, size, weight);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void shedHair() {
        // TODO Auto-generated method stub
        System.out.println(getExplicitType()+" sheds in the spring");
    }

    @Override
    public void makeNoise() {
        // TODO Auto-generated method stub
    
    }
    
}
