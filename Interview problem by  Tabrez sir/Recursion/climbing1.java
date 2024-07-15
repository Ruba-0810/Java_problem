/*
USING RECURSION
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
*/
import java.util.*;
class p1{
    public static int climbingNumber(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return climbingNumber(n-1)+climbingNumber(n-2);
        }
        
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(climbingNumber(n));
    }
}