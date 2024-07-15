//Eligible for marriage or not
import java.util.*;
class p3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the age:");
        int n=sc.nextInt();
        if(n>=18)
            System.out.println("Eligible for marriage");
        else
            System.out.println("Not Eligible for marriage");
    }
}