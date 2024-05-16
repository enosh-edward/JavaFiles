//calling class instance within the class

public class ComplexNumber {
    private double real;
    private double imaginary;
    
    public double getReal(){
        return real;
    }
    public double getImaginary(){
        return imaginary;
    }
    public void add(double real,double imaginary){
       this.real+=real;
       this.imaginary+=imaginary;
    }
    public void subtract(double real,double imaginary){
        this.real-=real;
        this.imaginary-=imaginary;
    }
    public ComplexNumber(double real,double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void add(ComplexNumber comp){
       this.real+=comp.getReal();
       this.imaginary+=comp.getImaginary();
    }
    public void subtract(ComplexNumber comp){
       this.real-=comp.getReal();
       this.imaginary-=comp.getImaginary();
    }
    public static void main(String args[]){
        System.out.println("Hi");
    }
}
