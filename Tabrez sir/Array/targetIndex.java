import java.util.*;
class p1{
    public static void targetIndex(int[] arr,int k){
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(i + " " +j);
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr={8,3,4,2,6,1,5};
        int k=10;
        targetIndex(arr,k);
    }
}