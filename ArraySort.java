import java.util.Random;
import java.util.Arrays;
public class ArraySort {

    public static void main(String... args){

        int[] array=new int[10];
        Random ranInt=new Random();

        for(int i=0;i<array.length;i++){
            array[i]=ranInt.nextInt(100);
        }

        Arrays.sort(array);

        System.out.println("Random Array list in Ascending order : "+Arrays.toString(array));

        int[] descArray=new int[10];

        int i=array.length-1;
        
        for(int number:array){
            descArray[i]=number;
            i--;
        }

        System.out.println("Random Array list in Ascending order : "+Arrays.toString(descArray));
    }
}
