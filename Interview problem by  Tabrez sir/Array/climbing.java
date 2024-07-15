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
    public static int climbing(int n){
        int[] arr=new int[n+1];
        arr[0]=1;
        arr[1]=1;
        for(int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        
        return arr[n];
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       //OUTOUT IN ARRAY  int[] result= climbing(n);
        System.out.println(climbing(n));
    }
}