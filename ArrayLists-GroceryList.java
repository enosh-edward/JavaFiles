import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
public class ArrayList_GroceryList{
    
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);

        ArrayList<String> GroceryList= new ArrayList<>();

        boolean flag=true;
        do{
            System.out.println(" Available actions : \n\n"+
                                  
                                 "0 - to shutdown\n"+ 
                                 "1 - to add item(s) to list (comma delimited list)\n"+
                                 "2 - to remove any items (comma delimited list)\n"+
                                 
                                 "Enter a number for which action you want to do :");

            int var=sc.nextInt();
            switch(var){
                case 0 : flag=false;
                         break;
                case 1 : addFromPrompt(GroceryList);
                         GroceryList.sort(Comparator.naturalOrder());
                         System.out.println(GroceryList);
                         break;
                case 2 : removeFromPrompt(GroceryList);
                         GroceryList.sort(Comparator.naturalOrder());
                         System.out.println(GroceryList);
                         break;
            }
    }while(flag);

    }

    public static void addFromPrompt(ArrayList<String> GroceryList){
        Scanner sc=new Scanner(System.in);
        var input=sc.nextLine();
        var arr=input.split(",");
        int length=arr.length;
        for(int i=0;i<length;i++){
        if(!GroceryList.contains(arr[i])){
            GroceryList.add(arr[i]);
        }
     }
    }

    public static void removeFromPrompt(ArrayList<String> GroceryList){
        Scanner sc=new Scanner(System.in);
        var input=sc.nextLine();
        var arr=input.split(",");
        for(String x : arr){
            if(GroceryList.contains(x)){
                GroceryList.remove(x);
            }
        }
    }
}
