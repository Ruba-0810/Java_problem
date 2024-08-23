import java.util.*;
class p1{
    public static int largest(int[] arr,int n){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int[] arr={8,6,24,3,18};
        int n=arr.length;
        System.out.println(largest(arr,n));
    }
}