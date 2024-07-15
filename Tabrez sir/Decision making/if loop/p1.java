//find remote of 5 button
import java.util.*;
class p1{
   static Scanner sc=new Scanner(System.in);
   public static void main(String [] args){
     System.out.println("1.on\n2.off\n3.volume\n4.press\n5.mute");
     System.out.print("Enter the number:");
     int n=sc.nextInt();
     if(n==1)
     System.out.println("on");
     if(n==2)
     System.out.println("off");
     if(n==3)
     System.out.println("volume");
     if(n==4)
     System.out.println("press");
     if(n==5)
     System.out.println("mute");
     
   }
}