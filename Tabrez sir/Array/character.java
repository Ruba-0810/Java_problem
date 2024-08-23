import java.util.*;
class p1{
    public static int character(char[] arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>='0' && arr[i]<='9'){
               sum=sum+arr[i]-48;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        char[] arr={'s','u','2','o','4','3'};
        int n=arr.length;
        System.out.println(character(arr,n));
    }
}