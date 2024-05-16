public class Account {
    
        private int accNum;
        private double balance;
        private String name;
        private String email;
        private int phone;

        public int getAccNum(){
            return accNum;
        }

        public double getBalance(){
            return balance;
        }

        public String getName(){
            return name;
        }

        public String getEmail(){
            return email;
        }

        public int getPhone(){
            return phone;
        }

        public void setName(String Name){
            name=Name;
        }
        public void deposit(int amount){
            this.balance+=amount;
            System.out.println("Account Number : "+accNum+
                               "Name           : "+name+
                               "Balance        : "+balance+
                               "Email          : "+email+
                               "Phone          : "+phone);
        }

        public void withdraw(int amount){
            if(balance<amount)
                System.out.println("Insufficient Balance");
            else{
            this.balance-=amount;
            System.out.println("Account Number : "+accNum+
                               "Name           : "+name+
                               "Balance        : "+balance+
                               "Email          : "+email+
                               "Phone          : "+phone);
            }
        }

        public void Describe(){
            System.out.println("Account Number : "+accNum+
                               "Name           : "+name+
                               "Balance        : "+balance+
                               "Email          : "+email+
                               "Phone          : "+phone);
        }
}
