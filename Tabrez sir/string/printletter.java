import java.util.*;
class p1{
    public static void main(String[]args){
        String a="a3b2c3a4";
        char[] ch=a.toCharArray();
        String res="";
       for(int i=1;i<ch.length;i=i+2) {
        int s=ch[i]-48;
        while(s>0){
            res=res+ch[i-1];
            s--;
        }
       }
       System.out.println(res);
    }
}