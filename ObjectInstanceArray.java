import java.util.Arrays;
public class ObjectInstancesArray {
    public static void main(String args[]){
        Object[] ObjectVariable=new Object[3];
        ObjectVariable[0]="Enosh";
        ObjectVariable[1]=new StringBuffer("Edward");

        ObjectVariable[2]=122;
        System.out.println(Arrays.toString(ObjectVariable));
    }
}
