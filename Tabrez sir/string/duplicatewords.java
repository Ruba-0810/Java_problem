import java.util.*;
class p1{
    public static void main(String[] args){
        String res="Aplle Bal Null";
        String[] a=res.split("");
         int count=0;
         boolean result=false;
         String ans="";
        for(int i=0;i<a.length-1;i++){
            if(!a[i].equals(" ")){
                if(a[i].equals(a[i+1])){
                    ans=ans+a[i];
                    result=true;
                }
            }
        }
    }
}
/*
duplicate 
l
a
l
*/