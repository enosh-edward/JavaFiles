import java.util.ArrayList;
public class Branch {
    // write code here
    private String name;
    private ArrayList<Customer> customers;
    
    public Branch(String name){
        this.name=name;
        customers=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public boolean newCustomer(String name,double initialTransaction){
        if(findCustomer(name)==null){
            Customer temp=new Customer(name,initialTransaction);
            customers.add(temp);
            return true;
        }
        return false;
    }
    public boolean addCustomerTransaction(String name,double transaction){
        if(findCustomer(name)!=null){
            Customer root =findCustomer(name);
            root.addTransaction(transaction);
            return true;
        }
        return false;
    }
    private Customer findCustomer(String name){
        for( Customer x:customers){
            if(x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }
}
