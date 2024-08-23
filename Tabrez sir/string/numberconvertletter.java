 /*
 String s="aaabbaac";
 OUTPUT:a3b2a2c1
*/
import java.util.*;
class p1{
    public static void main(String[] args){
        String s="aaabbaaccc";
        
        char[] ch=s.toCharArray();
        int count=1;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]==ch[i+1]){
               count++;
            }else{
                System.out.print(ch[i]+""+count);
                count=1;
            }
        }
        System.out.println(ch[ch.length-1]+""+count);
    }
}