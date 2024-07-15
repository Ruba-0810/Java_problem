/*Write a program to check whether a number is divisible by 5 and 10 or not divisible then 
print Development else Print Testing?
OUTPUT:
Enter the number:2
Testing
*/
import java.util.*;
class p3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n%5==0 && n%10==0)
        System.out.println("Development");
        else
        System.out.println("Testing");
    }
}