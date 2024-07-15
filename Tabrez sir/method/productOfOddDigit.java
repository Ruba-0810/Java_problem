import java.util.*;
class p1{
    public static void productOfOddNumber(int n){
        int fact=1;
        int product=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
            if(i%2!=0){
                product=product*i;
            }
        }
        System.out.println(fact);
         System.out.println(product);
        

        
    }
     public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        productOfOddNumber(n);
     }
}