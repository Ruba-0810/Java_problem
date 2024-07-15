// find 3rd largest number
import java.util.*;
class p1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a:");
        int a=sc.nextInt();
        System.out.print("Enter the b:");
        int b=sc.nextInt();
        System.out.print("Enter the c:");
        int c=sc.nextInt();
        if(a>b && a>c)
        System.out.print("a is largest");
        else if(b>c)
        System.out.println("b is largest");
        else
        System.out.println("c is largest");
    }
}