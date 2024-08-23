import java.util.*;
class p1{
    public static void main(String[] args){
        String s="aZCkAzcB";
        //OUTPUT: ackzABCZ
        char[] ch=s.toCharArray();
        Arrays.sort(ch);
        String lower="";
        String upper="";
        for(int i=0;i<s.length();i++){
            if(ch[i]>='a' && ch[i]<='z'){
                lower=lower+ch[i];
            }else{
                upper=upper+ch[i];
            }
        }
        System.out.println(lower+upper);
    }
}