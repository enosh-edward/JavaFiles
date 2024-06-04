public class Fish extends Animal{

    public Fish(String type,String size,double weight){
        super(type,size,weight);
    }
    @Override
    public void move(String speed){
        if(speed.equals("slow")){
            System.out.println(getExplicitType() + " Lazily swimming");
        }else{
            System.out.println(getExplicitType() +" Darting frantically");
        }
    }
    @Override
    public void makeNoise(){
        if(type=="Goldfish"){
            System.out.println("swish ");
        }else{
            System.out.println("splash ");
        }
    }
}
