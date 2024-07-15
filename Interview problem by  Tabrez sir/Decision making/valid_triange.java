/*
Write a program to input angles of a triangle and check whether triangle is valid or not
OUTPUT:
Enter a value:120
Enter b value:0
Enter c value:60
it is an triange
*/
import java.util.*;
class p4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value:");
        int b=sc.nextInt();
        System.out.print("Enter c value:");
        int c=sc.nextInt();
        int sum=a+b+c;
        if(sum==180)
        System.out.println("it is an triange");
        else
        System.out.println("it is not a triange");
    }
}