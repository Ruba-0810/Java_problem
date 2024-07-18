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
    public static int ocuurNumber(int[] arr,int n){
        int count=0;
        int element=0;
        for(int i=0;i<n;i++){
            if(count==0){
                count=1;
                element=arr[i];
            }else if(element==arr[i]){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<n;i++){
            if(element==arr[i]){
                count1++;
            }
        }
        if(count1>n/2){
            return element;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={2,1,1,1,1,2,1};
        int n=arr.length;
        System.out.println(ocuurNumber(arr,n));
    }
}