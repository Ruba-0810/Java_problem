/*
Write a program to read percentage display grade according to following

Percentage >=90% Grade A

Percentage >= 80% Grite B

Percentage >=70% Grade C

Percentage >=60% Grade D

Percentage >=40% Grade E

Percentage <40%: Grade F
OUTPUT:
*/
import java.util.*;
class p8{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n>=1 && n<=100){
            if(n>=90)
            System.out.println("Grade A");
            else if(n>=80 && n<90)
            System.out.println("Grade B");
            else if(n>=70 && n<80)
            System.out.println("Grade C");
            else if(n>=60 && n<70)
            System.out.println("Grade D");
            else if(n>=40 && n<60)
            System.out.println("Grade E");
            else
            System.out.println("Grade F ");

        }
        else{
           System.out.println("Invalid") ;
        }

    }
}