import java.util.*;
class p1{
    public static void removeDuplicate(int[] arr){
        int n=arr.length;
        int[] temp=new int[n];
        temp[0]=arr[0];
        int k=1;
        for(int i=1;i<n;i++){
            int j=0;
            for(;j<k;j++){
                if(arr[i]==arr[j]){
                    break;
                }
            }
            if(j==k){
                temp[k]=arr[i];
                k++;
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
           ans[i]=temp[i];
        }
       System.out.println(Arrays.toString(ans));
    }
    public static void main(String[] args){
        int[] arr={2,3,4,2,3,31,3,4,5};
        removeDuplicate(arr);
    }
}