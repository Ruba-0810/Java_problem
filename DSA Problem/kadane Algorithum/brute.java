/*
Example 1:
Input:
 arr = [-2,1,-3,4,-1,2,1,-5,4] 

Output:
 6 
 Explanation:
 [4,-1,2,1] has the largest sum = 6. 
 Examples 2:
Input:
 arr = [1] 

Output:
 1 
 */
import java.util.*;
class p1{
    public static int kadaneNumber(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
               sum=sum+arr[j];
               max=Math.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={1};
        int n=arr.length;
        System.out.println(kadaneNumber(arr,n));
    }
}