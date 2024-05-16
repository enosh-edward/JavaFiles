//  Equal point in a string of brackets

//Given a string S of opening and closing brackets '(' and ')' only. The task is to find an equal point. An equal point is an index such that the number of closing brackets on right from that point must be equal to number of opening brackets before that point.

class Solution {
    public long countSub(String str) {
        int l_count=0,r_count=0,point=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(')
                l_count++;
        }
        int count=0;
        if(l_count==0)
            return str.length();
        for(int j=str.length()-1;j>=0;){
                
            if(str.charAt(j)==')'){
                count++;
                j--;
            }
            else{
                j--;
                l_count--;
            }
            if(count>=l_count){
                    point = j+1;
                    break;
                }
        }
        return point;
    }
}
