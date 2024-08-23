
/*
INPUT:This is Smith
replace i= a
OUTPUT:Thas as Smath

*/
import java.util.*;
class p1{
    public static void main(String[] args){
        String s="This is Smith";
       String ans="";
       char get='z';
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
           if(ch[i]==get){
             ans=ans+'a';
           }else{
            ans=ans+ch[i];
           }
        }
        if(ans.equals(s)){
            System.out.println("In valid");
        }else{
            System.out.println(ans);
        }
    }
}