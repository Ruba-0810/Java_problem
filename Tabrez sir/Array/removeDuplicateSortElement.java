import java.util.*;
class p1{
    public static void removeDuplicateSortElement(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        int k=0;
        temp[0]=arr[0];
        for(int i=1;i<n;i++){
            if(temp[k]<arr[i]){
                k++;
                temp[k]=arr[i];
            }
        }
        int[] ans=new int[k+1];
        for(int i=0;i<=k;i++){
            ans[i]=temp[i];
        }
        System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args){
        int[] arr={2,2,3,4,4,5,5,6};
        removeDuplicateSortElement(arr);
    }
}