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
    public static int longestSubstring(int[] arr, int n,int k){
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            if(sum==k){
               max=Math.max(max,i+1);
            }
            int remainder=sum-k;
            if(map.containsKey(remainder)){
                int length=i-map.get(remainder);
                max=Math.max(max,length);
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={2,3,5,1,9};
        int n=arr.length;
        int k=5;
        System.out.println(longestSubstring(arr,n,k));
    }
}