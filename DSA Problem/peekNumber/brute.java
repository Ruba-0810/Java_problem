/*
Find a peak element which is not smaller than its neighbours
Input: array[]= {5, 10, 20, 15}
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.

Input: array[] = {10, 20, 15, 2, 23, 90, 67}
Output: 20 or 90
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20, 
similarly 90 has neighbors 23 and 67.
*/
import java.util.*;
class p1{
    public static int peekNumberBinarySearch(int[] arr,int n){
     int start=1;
     int end=n-2;
     while(start<=end){
          int mid=start+((end-start)/2);
         if((mid==0 || arr[mid-1]<arr[mid]) && (mid==n-1 || arr[mid]>arr[mid+1])){
            return mid;
         }
         else if(arr[mid-1]<arr[mid]){
            start=mid+1;
         }else{
            end=mid-1;
         }
      }
      return -1;
    }
    public static void main(String[] args){
        int[] arr={10, 20, 15, 2, 23, 90, 67};
        int n=arr.length;
        System.out.println(peekNumberBinarySearch(arr,n));
    }
}