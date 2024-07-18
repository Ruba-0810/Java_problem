/*
Find the Majority Element that occurs more than N/2 times
Example 1:
Input Format: N = 3, nums[] = {3,2,3}
Result: 3
Explanation
: When we just count the occurrences of each number and 
compare with half of the size of the array, 
you will get 3 for the above solution. 
*/
import java.util.*;
class p1{
    public static int occurMoreNumber(int[] arr,int n){
        for(int i=0;i<n;i++){
            int ans=arr[i];
            int count=1;
            for(int j=i+1;j<n;j++){
                if(ans==arr[j]){
                    count++;
                }
            }
            if(count>n/2){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr={3,2,3};
        int n=arr.length;
        System.out.println(occurMoreNumber(arr,n));
    }
}