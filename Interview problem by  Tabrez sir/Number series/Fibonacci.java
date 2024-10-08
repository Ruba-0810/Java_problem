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
import java.util.Scanner;
class p1{
    public static int climbingDigit(int n){
        int first=1;
        int second=2;
        for(int i=3;i<=n;i++){
            int third=second+first;
            first=second;
            second=third;

        }
        return second;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
       System.out.println(climbingDigit(n));
    }
}