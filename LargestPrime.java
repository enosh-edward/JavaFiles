public class LargestPrime{
     public static void main(String args[])
     {
          System.out.println(getLargestPrime(45));
     }
     public static int getLargestPrime(int number){
          if(number<=1)
              return -1;
          int i=number/2;
          while(i>1){
              if(isPrime(i)){
                  if(number%i==0){
                    return i;
                  }else{
                    i--;
                    continue;
                  }
              }else{
                  i--;
                  continue;
              }
          }
          return 2;
      }
      public static boolean isPrime(int number){
          for(int i=2;i<number/2;i++){
              if (number%i==0)
                  return false;
          }
          return true;
      }
}
