/*Write a program to check whether a year is leap year or not
OUTPUT:
Enter the year:2001
2001 it is not leap year
*/
import java.util.*;
class p6{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the year:");
        int n=sc.nextInt();
        if(n%4==0 && n%100 !=0 || n%400==0)
        System.out.println(n+" it is an leap year");
        else
        System.out.println(n+" it is not leap year");
    }
}