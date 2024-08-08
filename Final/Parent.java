// instance and static initializers
public class Parent {
    
    private final String name;

    private final String dob;

    static {    // Static Initializer block  - executes first
                System.out.println("Parent static initializer: class being constructed");
    }

    {       //instance initializer block - executes after static
        name = "John Doe";
        dob = "01/01/1900";

        System.out.println("In Parent initializer");
    }                          

    public Parent(){
        System.out.println("In Parent's No Args Constructor");
    }

    public Parent(String name, String dob){
        //this.name = name;
        //this.dob=dob;
        System.out.println("In Parent Constructor");    }

    public String getName(){
        return name;
    }
    public String getDob(){
        return dob;
    }

    @Override
    public String toString(){
        return "name='" +name +'\'' +", DOB='" + '\'';
    }

    public static void main(String[] args){
        Parent parent = new Parent();
    }
}
