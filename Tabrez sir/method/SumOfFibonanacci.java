import java.util.*;
class p1{
    public static void fibonanacii(int n){
        int a=0;
        int b=1;
        int c=0;
        int sum=1;
        System.out.print(a+" " + b +" ");
        for(int i=1;i<=n-2;i++){
           c=a+b;
           System.out.print(c+" ");
           a=b;
           b=c;
    
        }

     System.out.println(sum);
    }
    public static void main(String [] args){
        int n=5;
        fibonanacii(n);
    }
}