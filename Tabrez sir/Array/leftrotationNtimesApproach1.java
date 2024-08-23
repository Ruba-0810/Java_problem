import java.util.*;
class p1{
    public static void leftRotation(int[] arr,int k){
        int n=arr.length;
        for(int i=1;i<=k;i++){
            int first=arr[0];
            for(int j=1;j<n;j++){
                arr[j-1]=arr[j];
            }
            arr[n-1]=first;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};//40,50,10,20,30
        int k=2;
        leftRotation(arr,k);
    }
}