import java.util.*;
class p1{
    public static int sumOfEvenNumber(int[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={2,4,5,7,8,10,12,24};
        int n=arr.length;
        System.out.println(sumOfEvenNumber(arr,n));
    }
}