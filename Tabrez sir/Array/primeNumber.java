import java.util.*;
class p1{
    public static int primeNumber(int[] arr){
        int count=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
             boolean ruba=true;
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    ruba=false;
                }
            }
            if(ruba){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int[] arr={2,8,5,7,10,12};
        System.out.println(primeNumber(arr));
    }
}