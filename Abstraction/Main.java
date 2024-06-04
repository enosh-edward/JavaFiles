import java.util.ArrayList;
import java.util.Arrays;
public class Main{

    public static void main(String args[]){
        Dog dog = new Dog("Wolf","big",100);
        dog.makeNoise();
        doAnimalStuff(dog);

        ArrayList<Animal> animals=new ArrayList<>();
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("Goldfish","small", 1));
        animals.add(new Fish("Barracuda","big",75));
        animals.add(new Dog("Pug", "small", 20));
        animals.add(new Horse("Clydesdale", "large", 1000));
        for(Animal animal : animals){
            doAnimalStuff(animal);
            if(animal instanceof Mammal CurrentMammal){
                CurrentMammal.shedHair();
            }
        }
    }
    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }
}
