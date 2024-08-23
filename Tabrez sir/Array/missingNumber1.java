import java.util.*;
class p1{
    public static void missingNumber(int[] arr,int n){
        for(int i=0;i<n;i++){
            int j=1;
            if(arr[i]!=j){
                System.out.println(j);
                i--;
            }
            j++;
        }
    }
    public static void main(String[] argas){
        int[] arr={1,4,5,6,9};
        int n=arr.length;
        missingNumber(arr,n);
    }
}