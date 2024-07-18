/*
Find the Majority Element that occurs more than N/2 times
Example 1:
Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation
: When we just count the occurrences of each number and 
compare with half of the size of the array, 
you will get 3 for the above solution. 
Example 2:
Input Format:
  N = 7, nums[] = {2,2,1,1,1,2,2}

Result
: 2
*/
import java.util.*;
class p1{
    public static int occurMoreNumber(int[] arr,int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int value=map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue()>n/2){// get value
                  return it.getKey();
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,1,1,1,1,3,3,1};
        int n=arr.length;
        System.out.println(occurMoreNumber(arr,n));
    }
}