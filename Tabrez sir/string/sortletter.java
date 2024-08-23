/*
INPUT:"azAZcNbM"
OUTPUT:abAMcNzZ
*/
import java.util.*;
class p1{
    public static void main(String[] args){
        String s="azAZcNbM";
        String upper="";
        String lower="";
       //AMNZamnz
        char ch[]=s.toCharArray();
         Arrays.sort(ch);
        for(int i=0;i<ch.length;i++){//
           if(ch[i]>='A' && ch[i]<='Z'){
               upper=upper+ch[i];
           }else{
            lower=lower+ch[i];
           }
        }
        System.out.println(lower);
        System.out.println(upper);
        String res="";
        int l=0;
        int u=0;
       for(int i=0;i<s.length();i++){
             if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                res=res+lower.charAt(l);
                l++;
             }else{
                 res=res+upper.charAt(u);
                 u++;
             }

       }
       System.out.println(res);
    }
}