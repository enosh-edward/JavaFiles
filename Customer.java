public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress(){
        return emailAddress;
    }

    public Customer(String name,double creditLimit,String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }
    public Customer(){
        name="Karthik";
        creditLimit=1290300.89;
        emailAddress="karthik678@yahoo.com";
    }
    public Customer(String name,String emailAddress){
        this();
        this.name=name;
        this.emailAddress=emailAddress;
    }
}
