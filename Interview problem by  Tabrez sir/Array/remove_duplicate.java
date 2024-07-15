/* USINg NORMAL METHOD WITHOUT SORTING
INPUT=[2,3,4,2,3,31,3,4,5]
OUTPUT=[2,3,4,31,5]
*/
import java.util.*;
class p1{
    public static int[] removeDuplicate(int[]arr,int n){
        //modify and count
        int count=0;
        int visited=Integer.MIN_VALUE;
         for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j] && arr[i]!=visited){
                    count++;
                    arr[j]=visited;
                }
            }
         }
         int[] array=new int[arr.length-count];
         int k=0;
         for(int i=0;i<n;i++){
            if(arr[i]!=visited){
                array[k]=arr[i];
                k++;
            }
         }
         return array;
    }
    public static void main(String[] args){
        int[] arr={2,3,4,2,3,31,3,4,5};
        int n=arr.length;
        int[] ans=removeDuplicate(arr,n);
        System.out.println(Arrays.toString(ans));
    }
}