
/*
Input: array[]= {5, 10, 20, 15} //3,2
Output: 20
Explanation: The element 20 has neighbors 10 and 15, both of them are less than 20.
*/
import java.util.*;
class p1{
    public static int peakNumber(int[] arr){//5,7
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        if(arr[0]>=arr[1]){// 3,5,9
            return arr[0];
        }
        if(arr[n-1]>=arr[n-2]){// 8<9
            return arr[n-1];
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1]){
                return arr[i];
            }
        }
        return -1;
    }
      public static void main(String[] args){
        int[] arr={7,5};
        System.out.println(peakNumber(arr));
      }
}