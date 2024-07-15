//find largest number for two number
import java.util.*;
class p5{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a:");
        int a=sc.nextInt();
        System.out.print("Enter the b:");
        int b=sc.nextInt();
        if(a<b)
        System.out.println("b is largest");
        else
        System.out.println("a is largest");
    }
}