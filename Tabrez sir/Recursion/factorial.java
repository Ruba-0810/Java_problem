import java.util.*;
class p1{
    static int fact=1;
    public static int factorialRecursion(int n){
        if(1<n){
            fact=fact*n;
           n--;
            factorialRecursion(n);
        }
        return fact;
    } 
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factorialRecursion(n));
    }
}