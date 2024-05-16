public class Employee extends Worker{
    private long employeeId;
    private String hireDate;
    Employee(){
        System.out.println("Hi");
    };
    public Employee(long employeeId,String hireDate){
        this();
        this.employeeId=employeeId;
        this.hireDate=hireDate;
    }
    public static void main(String ags[]){
        Employee abc=new Employee(123,"12/23/1234");
    }
}
