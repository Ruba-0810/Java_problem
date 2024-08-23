import java.util.*;
class p1{
    public static void missingNumber(int[] arr,int n){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int[] newArray=new int[max+1];
        for(int i=1;i<n;i++){
            newArray[arr[i]]=newArray[arr[i]]+1;
        }
        for(int i=1;i<newArray.length;i++){
            if(newArray[i]==0){
                System.out.println(i+1);
            }
        }
    }
    public static void main(String[] argas){
        int[] arr={1,4,5,6,9};
        int n=arr.length;
        missingNumber(arr,n);
    }
}