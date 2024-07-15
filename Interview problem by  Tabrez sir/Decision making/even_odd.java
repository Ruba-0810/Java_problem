/*Write a program to check whether a number is even or add
OUTPUT:
Enter the number:3
3 is an odd number
*/
import java.util.*;
class p5{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        if(n%2==0)
        System.out.println(n+" is an even number");
        else
        System.out.println(n+" is an odd number");
    }
}