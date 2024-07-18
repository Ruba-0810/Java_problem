/*
Find a peak element which is not smaller than its neighbours
Input: array[]= {5, 10, 15, 20}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, 
similarly 90 has neighbors 23 and 67.
*/
import java.util.*;
class p1{
    public static int  peakNumber(int[] arr,int n){
        
        for(int i=0;i<n;i++){
            if((i==0 || arr[i-1]<arr[i] )&& (i==n-1 || arr[i]>arr[i+1])){
              return i;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int[] arr={5, 10, 15, 20};
        int n=arr.length;
        System.out.println(peakNumber(arr,n));
       
    }
}

