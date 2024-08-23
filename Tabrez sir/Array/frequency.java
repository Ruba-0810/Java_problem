import java.util.*;
class p1{
    public static void frequency(int[] arr){
        int visited=Integer.MIN_VALUE;
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]!=visited){
                int count=1;
               for(int j=i+1;j<n;j++){
                    if(arr[i]==arr[j]){
                        arr[j]=visited;
                        count++;
                    }
               }
               System.out.println(arr[i] +" : "+count);
            }
        }
    }
    public static void main(String[] args){
        int[] arr={8,2,8,1,5,1,8};
        frequency(arr);
    }
}