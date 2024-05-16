public class NumberToRoman
{
    static String str="";
	static String temp="";
    public static void main(String args[]){
        System.out.println(convertToRoman(2028));
    }
	static String convertToRoman(int n){
	        if (0<n && n<4)
	            str+=division(n,1,"I");
	        if(n==4)
	            str+=division(n,4,"IV");
	        if(n==5)
	            str+=division(n,5,"V");
	        if(5<n && n<=8)
	            str+=division(n,5,"V");
	        if(n==9)
	            str+="IX";
	        if(n>=10 && n<40)
	            str+=division(n,10,"X");
	        if(n>=40 && n<50)
	            str+=division(n,40,"XL");
	        if(n>=50 && n<90)
	            str+=division(n,50,"L");
	        if(n>=90 && n<100)
	            str += division(n,90,"XC");
	        if(n>=100 && n<400)
	            str+= division(n,100,"C");
	        if(n>=400 && n<500)
	            str+= division(n,400,"CD");
	        if(n>=500 && n<900)
	            str += division(n,500,"D");
	        if(n>=900 && n<1000)
	            str += division(n,900,"CM");
	        if(n>=1000)
	            str += division(n,1000,"M");
	    return str;
	}
	public static String division(int n,int divisor,String roman){
	    int div=n/divisor;
	    int rem=n%divisor;
	    for(int i=0;i<div;i++){
	        temp+=roman;
	    }
	    if(rem>0)
	        convertToRoman(rem);
	    return temp;
	}
}
