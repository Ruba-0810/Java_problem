// second largest in three number
import java.util.*;
class p3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a:");
        int a=sc.nextInt();
        System.out.print("Enter the b:");
        int b=sc.nextInt();
        System.out.print("Enter the c:");
        int c=sc.nextInt();
        if(a>b && b<c) 
        System.out.println(b);
        else if(a>c) 
        System.out.println(a);
        else
        System.out.println(c);

    }
}
/*
a=2
b=4
c=1
2>4 
2>1
*/
