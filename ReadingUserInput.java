import java.util.Scanner;
public class ReadingUserInput{
     public static void main(String args[])
     {
          Scanner sc=new Scanner(System.in);
          int total=0,count=1;
          do{
               System.out.println("Enter number #"+count+":");
               try{
                    int inputVar=Integer.parseInt(sc.nextLine());
                    count++;
                    total+=inputVar;
               }catch(NumberFormatException ImproperData){
                    System.out.println("Invalid input format. Try Again");
               }

          }while(count<=5);

          System.out.println(" Total Sum is :"+ total);
     }
     
     
}
