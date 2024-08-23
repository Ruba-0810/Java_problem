
/*
AEHRT
AEHRT
Anagram
*/
import java.util.*;
class p1{
    public static void main(String[] args){
        String s1="Ajay";
        String s2="jaya";
        String r1=s1.toUpperCase();
        String r2=s2.toUpperCase();
        char[] ch1=r1.toCharArray();
        char[] ch2=r2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(ch1);
        System.out.println(ch2);
        boolean ruba=true;
        if(ch1.length!=ch2.length){
            ruba=false;
        }
        for(int i=0;i<ch1.length;i++){
           
                if(ch1[i]!=ch2[i]){
                    ruba=false;
                    break;
            }
        }
        if(ruba){
            System.out.println("Anagram");
        }else{
            System.out.println("is not Anagram");
        }

    }
}