import  java.util.*;
class p1{
    public static void moveallZeroToleft(int[] arr){
        int n=arr.length;
        int i=0;
        int j=n-1;
       while(i<j){
           if(arr[i]!=0 && arr[j]!=0){
            j--;
           }
           else if(arr[i]==0 && arr[j]!=0){
               j--;
           }else if(arr[i]==0 && arr[j]==0){
            i++;
           }
           else if(arr[i]!=0 && arr[j]==0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
           }
       }
       System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
         int[] arr={1,0,2,0,0,0,4,5,6,7,8};//[0000]
         moveallZeroToleft(arr);

    }
}