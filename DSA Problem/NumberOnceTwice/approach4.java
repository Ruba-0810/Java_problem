/*
Find the number that appears once, and the other numbers twice
Example 1:
Input Format:
 arr[] = {2,2,1}
Result:
 1
Explanation:
 In this array, only the element 1 appear once and so it is the answer.

Example 2:
Input Format:
 arr[] = {4,1,2,1,2}
Result:
 4
*/
import java.util.*;
class p1{
    public static int numberOnceTwice(int[] arr,int n){
        int xor=0;
        for(int i=0;i<n;i++){
            xor=xor^arr[i];
        }
        return xor;
    }
    public static void main(String [] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the n value");
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
       }
        System.out.println(numberOnceTwice(arr,n));
    }
}