import java.util.*;
class p1{
    public static void rightRotation(int[] arr,int k){
        int n=arr.length;
        for(int i=1;i<=k;i++){
            int last=arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1]=arr[j];
            }
            arr[0]=last;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};//40,50,10,20,30
        int k=4;
        rightRotation(arr,k);
    }
}