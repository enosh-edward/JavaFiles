import java.util.ArrayList;
public class Bank {
    // write code here
    private String name;
    private ArrayList<Branch> branches;
    
    public Bank(String name){
        this.name=name;
        branches=new ArrayList<>();
    }

    public static void main(String... args){
        Bank bank = new Bank("National Australia Bank");
 
        bank.addBranch("Adelaide");
 
        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12);
 
        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction("Adelaide", "Mike", 1.65);
 
        bank.listCustomers("Adelaide", true);
    }
    
    public boolean addBranch(String name){
        if(findBranch(name)==null){
            branches.add(new Branch(name));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String branch,String name,double initialTransaction){
        if(findBranch(branch)!=null){
            Branch root=findBranch(branch);
            if(root.newCustomer(name,initialTransaction))
                return true;
            return false;
        }else
            return false;
    }
    public boolean addCustomerTransaction(String branch,String name,double transaction){
        if(findBranch(branch)!=null){
            Branch root=findBranch(branch);
            if(root.addCustomerTransaction(name,transaction))
                return true;
            return false;
        }else
            return false;
    }
    private Branch findBranch(String name){
        for(Branch x : branches){
            if(x.getName().equals(name)){
                return x;
            }
        }
        return null;
    }
    public boolean listCustomers(String branch,boolean printTransactions){
        if(findBranch(branch)==null){
            return false;
        }
        if(printTransactions){
            Branch root=findBranch(branch);
            System.out.println("Customer details for branch "+root.getName());
            ArrayList<Customer> customer_list=root.getCustomers();
            int k=1;
            for(Customer customer_copy:customer_list){
                System.out.println("Customer: "+customer_copy.getName()+"["+k+"]");
                System.out.println("Transactions");
                ArrayList<Double> transaction_copy=customer_copy.getTransactions();
                int i=1;
                for(Double x:transaction_copy){
                    System.out.println("["+i+"]"+" Amount "+x);
                    i++;
                }
                k++;
            }
        }else{
            Branch root=findBranch(branch);
            System.out.println("Customer details for branch "+root.getName());
            ArrayList<Customer> customer_list=root.getCustomers();
            int k=1;
            for(Customer customer_copy:customer_list){
                System.out.println("Customer: "+customer_copy.getName()+"["+k+"]");
                k++;
            }
        }
        return true;
    }
}
