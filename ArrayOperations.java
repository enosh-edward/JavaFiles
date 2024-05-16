import java.util.Scanner;
import java.util.Arrays;
public class ArrayOperations {
    public static void main(String args[]){
        System.out.println("Enter comma after each values");
        //int[] array=readIntegers();
        //System.out.println("Minimum value provided is :"+findMin(array));
    }
    public static void readIntegers(){
        System.out.println("in the readIntegers method");
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String[] array= input.split(",");
        int[] intArray=new int[array.length];
        int i=0;
        for(String x:array){
            intArray[i]= Integer.parseInt(x);
            i++;
        }
        int x=findMin(intArray);
        System.out.println(x);
        //return intArray;
    }
    private static int findMin(int[] array){
        System.out.println("in the findMe method");
        int min=Integer.MAX_VALUE;
        for(int x:array){
            if(x<min){
                min=x;
            }
        }
        return min;
    }
}

// call these above methods by the class given below and know how "static" and "private" keyowords works
//import java.util.Arrays;
// public class Main{

//     public static void main(String args[]){
//         //ArrayOperations arr=new ArrayOperations();
//         //System.out.println(Arrays.toString(ArrayOperations.readIntegers()));
//         ArrayOperations.readIntegers();
//         System.out.println("its over");
//     }
// }
