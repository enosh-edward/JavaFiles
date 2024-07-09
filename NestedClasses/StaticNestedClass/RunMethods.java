package NestedClasses;

public class RunMethods {
    public static void main(String args[]){
        List<StoreEmployee> storeEmployees = new ArrayList<>(List.of(
            new StoreEmployee(10015,"Meg",2019,"Target"),
            new StoreEmployee(10515,"Joe",2019,"Walmart"),
            new StoreEmployee(10105,"Tom",2019,"Macys"),
            new StoreEmployee(10215,"Marty",2019,"Walmart"),
            new StoreEmployee(10322,"Bud",2019,"Target")
        ));

        var c0= new EmployeeComparator<StoreEmployee>();
        var c1= new Employee.EmployeeComparator<StoreEmployee>();
        var c2= new StoreEmployee().new StoreComparator<StoreEmployee>();
    }
    public static <T> void sortIt(List<T> list, Comparator<? super T> comparator){
        System.out.println("Sorting with Comparator: "+ comparator.toString());
        list.sort(comparator);
        for(var employee : list){
            System.out.println(employee);
        }
    }
}
