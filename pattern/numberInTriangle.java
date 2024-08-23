/*
     1 
    2 2 
   3 3 3 
  4 4 4 4 
 5 5 5 5 5 
6 6 6 6 6 6 
*/
// Java Program to print pattern
// Number triangle pattern
import java.util.*;
class p1{
     public static void patterNumber(int n){
          for(int i=1;i<=n;i++){
               for(int j=1;j<=n-1;j++){
                    System.out.print(" ");
               }
               for(int k=1;k<=i;k++){
                    System.out.println("*");
               }
          }
     }
     public static void main(String[] args){
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          patterNumber(n);
     }
}