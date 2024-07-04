

import java.util.Comparator;

public class Employee {

    public static class EmployeeComparator<T extends Employee> implements Comparator<Employee>{

        private String sortType;

        public EmployeeComparator(){
            this("name");
        }
        public EmployeeComparator(String string) {
            //TODO Auto-generated constructor stub
        }
        @Override
        public int compare(Employee o1, Employee o2){
            if(sortType.equalsIgnoreCase("yearStarted")){
                return o1.yearStarted - o2.yearStarted;
            }
            return o1.name.compareTo(o2.name);
        }
    }
    private int EmployeeId;
    private int yearStarted;
    private String name;

    public Employee(){}
    
    public Employee(int EmployeeId,String name,int yearStarted){
        this.EmployeeId=EmployeeId;
        this.name=name;
        this.yearStarted=yearStarted;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "%d %-8s %d".formatted(EmployeeId,name,yearStarted);
    }
}
