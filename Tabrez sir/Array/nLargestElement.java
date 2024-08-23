import java.util.*;
class p1{
    public static int nlargest(int[] arr,int k){
        int n=arr.length;
        int visited=Integer.MIN_VALUE;
       int result=Integer.MIN_VALUE;
        for(int i=1;i<=k;i++){
            int max=Integer.MIN_VALUE;
            int index=-1;
            for(int j=0;j<n;j++){
                if(max<arr[j] && arr[j]!=visited){
                    max=arr[j];
                    index=j;
                }
            }
                if(index!=-1){
                    arr[index]=visited;
                }
                result=max;
        }
        return result;
    }
    public static void main(String[] args){
        int[] arr={8,40,6,54,90,40};
        int k=4;
        System.out.println(nlargest(arr,k));
    }
}