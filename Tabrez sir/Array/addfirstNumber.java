import java.util.*;
class p1{
    public static int addFirst(int[] arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int a=arr[i];
            if(a>=10){
                 while(a>10){
                   a=a/10;
            }
                sum=sum+a;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int[] arr={85,3,4,16,265,93,3,21,123};
        System.out.println(addFirst(arr));

    }
}