/*
Two Sum : Check if a pair with given sum exists in Array
Example 1:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 14
Result: YES (for 1st variant)
       [1, 3] (for 2nd variant)
Explanation: arr[1] + arr[3] = 14. So, the answer is “YES” for the first variant and [1, 3] for 2nd variant.

Example 2:
Input Format: N = 5, arr[] = {2,6,5,8,11}, target = 15
Result: NO (for 1st variant)
	[-1, -1] (for 2nd variant)
Explanation: There exist no such two numbers whose sum is equal to the target.
*/
import java.util.*;
class p1{
       public static int[] sumOfArrayExits(int[] arr,int n,int k){
              int[] temp=new int[2];
          HashMap<Integer,Integer> map=new HashMap<>();
          for(int i=0;i<n;i++){
              int result=k-arr[i];
              if(map.containsKey(result)){
                   return new int[]{map.get(result),i};
              }else{
                     map.put(arr[i],i);
              }
          }
          return new int[]{-1,-1};
       }
       public static void main(String []args){
              int[] arr={2,6,5,8,11};
              int n=arr.length;
              int k=14;
              int[] result=sumOfArrayExits(arr,n,k);
              System.out.println(Arrays.toString(result));
       }
}