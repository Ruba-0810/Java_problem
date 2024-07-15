/*
Write a prograrn to check whether the triangle equilateral,isosceles or scalar
*/

import java.util.*;
class p12{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value:");
        int b=sc.nextInt();
        System.out.print("Enter c value:");
        int c=sc.nextInt();
        if(a==b && b==c)
        System.out.println("Equilateral triange");
        else if(a==b)
        System.out.println("Isosceles triangle");
        else
        System.out.println("Scalar triangle");
    }
}