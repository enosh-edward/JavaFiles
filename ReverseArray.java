import java.util.Arrays;
public class ReverseArray {
    
    public static void main(String args[]){
        int[] array={1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before"+Arrays.toString(array));
        reverse(array);
        System.out.println("After"+Arrays.toString(array));
    }
    public static void reverse(int[] array){
        int mid=array.length/2,j=array.length-1,temp=0;
        for (int i=0;i<mid;i++){
            temp=array[i];
            array[i]=array[j];
            array[j--]=temp;
            System.out.println(Arrays.toString(array));
        }
    }
}
