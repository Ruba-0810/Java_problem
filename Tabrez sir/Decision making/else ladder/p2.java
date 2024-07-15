//3rd samllest value
import java.util.*;
class p2{
    public static void main (String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a value:");
        int a=sc.nextInt();
        System.out.print("Enter b value:");
        int b=sc.nextInt();
        System.out.print("Enter c value:");
        int c=sc.nextInt();
        if(a<b && a<c)
        System.out.println("a is smallest");
        else if(b<c )
        System.out.println("b is smallest");
        else
        System.out.println("c is smallest");
    }
}
/*
a=4
b=7
c=1
4<7 7<1 flase
7<1 fase

*/