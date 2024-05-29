import java.util.ArrayList;
public class Customer {
    // write code here
    private String name;
    private ArrayList<Double> transactions;
    
    public Customer(String name,double initialTransaction){
        this.name=name;
        transactions=new ArrayList<>();
        transactions.add(initialTransaction);
    }
    public String getName(){
        return name;
    }
    public ArrayList<Double> getTransactions(){
        return transactions;
    }
    public void addTransaction(double transact){
        transactions.add(transact);
    }
}
