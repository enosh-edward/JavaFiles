import java.util.Scanner;
public class UserInputMaxMin{

     public static void main(String args[]){
          Scanner sc=new Scanner(System.in);
          int min=0,max=0;
          boolean flag=true;
          do{
               System.out.println("Enter a number to Continue. / character to Exit. :");
               try{
                    int userinput=Integer.parseInt(sc.nextLine());
                    if(min==0 && max==0){
                         min=userinput;
                         max=userinput;
                         continue;
                    }
                    if(userinput<=min){
                         min=userinput;
                         continue;
                    }
                    if(userinput>=max){
                         max=userinput;
                         continue;
                    }
                    }catch(NumberFormatException nfe){
                         System.out.println("Exiting....");
                         flag=false;
                    }
               }while(flag);

               System.out.println(" Max number : "+max+" Min number :"+min);
     }

          
}
