//check number is divisible by 4 & 6 if it divisble it give your name else it will write java
import java.util.*;
class p4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n%4==0 && n%6==0)
         System.out.println("Rubavathy");
        else
         System.out.println("Java");
    }
}