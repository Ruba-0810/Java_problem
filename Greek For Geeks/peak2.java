/*
Input: array[]= {5, 10, 20, 15} //3,2
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
*/
import java.util.*;
class p1{
    public static int peakNumberapproach(int[] arr,int start,int end,int n){
       // while(start<=end){
           int mid=start+(end-start)/2;
          if((mid==0 ||arr[mid-1]<=arr[mid]) && (mid==n-1 ||arr[mid]>=arr[mid+1])){
            return arr[mid];
          }else if(mid>0 && arr[mid-1]>arr[mid]){
                  return peakNumberapproach(arr,start,mid-1,n);//1,2,3
          }
            
             return peakNumberapproach(arr,mid+1,end,n);
          
        //}
       // return -1;
    }
    public static void main(String[] ags){
        int [] arr={10,15, 2, 23, 90, 67};
        int n=arr.length;
        int start=0;
        int end=n-1;
        System.out.println(peakNumberapproach(arr,start,end,n));
    }
}