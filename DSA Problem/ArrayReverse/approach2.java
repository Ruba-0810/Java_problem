/*  
USING swap method
Example 1:
Input: N = 5, arr[] = {5,4,3,2,1}
Output: {1,2,3,4,5}
Explanation: Since the order of elements gets reversed the 
first element will occupy the fifth position, the second element 
occupies the fourth position and so on.

Example 2:
Input: N=6 arr[] = {10,20,30,40}
Output: {40,30,20,10}
Explanation: Since the order of elements gets reversed the first element 
will occupy the 
fifth position, the second element occupies the fourth
 position and so on.
 */
import java.util.*;
class p1{
    public static int[] reverseArray(int[] arr,int n){
        int start=0;
        int end=n-1;
          while(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
          }
          return arr;
    }
    public static void main(String[] args){
        int[] arr={10,20,30,40};
        int n=arr.length;
        int[] result=reverseArray(arr,n);
        System.out.println(Arrays.toString(result));
    }
}