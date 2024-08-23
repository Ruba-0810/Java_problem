import java.util.*;
class p1{
    public static int[] move(int[] arr,int k){
        int n=arr.length;
        int[] temp=new int[k];
        for(int i=0;i<k;i++){
           temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]= arr[i];
        }
        for(int i=0;i<temp.length;i++){
            arr[n-k+i]=temp[i];
        }
     return arr;
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};//40,50,10,20,30
        int k=2;
        int[] result=move(arr,k);
        System.out.println(Arrays.toString(arr));
    }
}