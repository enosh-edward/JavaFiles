public class SalariedEmp extends Employee{
    double annualSalary;
    boolean isRetired;
    public SalariedEmp(double annualSalary,boolean isRetired){
        this.annualSalary=annualSalary;
        this.isRetired=isRetired;
    }

    public String Retire(){
        return endDate;
    }
    public static void main(String args[]){
        SalariedEmp emp=new SalariedEmp(1,true);

    }
}
