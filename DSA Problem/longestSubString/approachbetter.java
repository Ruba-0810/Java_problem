/*
USING nested for loop ON2
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
    public static int logestSubString(int[] arr,int k,int n){
        int ans=0;
        for(int i=0;i<n;i++){
            int sum=arr[i];
            int count=1;
            //int max=0;
            
            for(int j=i+1;j<n;j++){
                sum=sum+arr[j];
                  count++;
                 if(sum==k){
                   ans=Math.max(ans,count);
                 }
            }
        }
        return ans;
    }
    public static void main(String [] args){
        int[] arr={1,9,2,3,5};
        int k=10;
        int n=arr.length;
        System.out.println(logestSubString(arr,k,n));
    }
}