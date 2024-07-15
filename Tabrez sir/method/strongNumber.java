import java.util.*;
class p1{
    public static int strongNumber(int n){
        
        int sum=0;
        while(n>0){
        int last=n%10;
         int fact=product(last);
            sum=sum+fact;
            n=n/10;
         }
       return sum;
    }
    public static int product(int last){
        int flag=1;
        for(int i=1;i<=last;i++){
            flag=flag*i;
        }
        return flag;
    }
    public static void main(String [] args){
        int n=145;
        int result=strongNumber(n);
        if(result==n){
            System.out.println("Strong Number");
        }else{
            System.out.println("Not a Strong Number");
        }
    }
}