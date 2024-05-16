public class StringDivBySeven {
 
        public static void main(String... args){
            System.out.println(isdivisible7("371"));
        }
        static int isdivisible7(String num){
            // code here
            int number=Integer.valueOf(num);
            if(number%7==0)
                return 1;
            return 0;
            
        }
    }

