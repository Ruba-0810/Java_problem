/*
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.
*/
import java.util.*;
class p1{
    public static int longestSubStringNumber(int[] arr,int n,int k){
        int left=0;
        int right=0;
        int sum=arr[0];
        int max=0;
        while(right<n){
        while(left<right && sum>k){
            //find left because i need first substring like 1 to 8 here 1 is declare has left
            sum=sum-arr[left];
            left++;
        }
        if(sum==k){
            max=Math.max(max,right-left+1);
        }
        right++;
        if(right<n){
        sum=sum+arr[right];
           }
        }
        return max;
    }
    public static void main(String [] args){
        int[] arr={2,3,5,1,9};
        int k=10;
        int n=arr.length;
        System.out.println(longestSubStringNumber(arr,n,k));
    }
}