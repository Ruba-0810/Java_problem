

/*
https://leetcode.com/problems/longest-consecutive-sequence/
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 Therefore its length is 4.
*/
import java.util.*;
class p1{
    public static int longestConsectiveNumber(int[] arr){
        int n=arr.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        
        int max=0;
        for(int i: set){
            if(!set.contains(i-1)){
                int x=i;
                int count=1;
                while(set.contains(x+1)){
                    count++;
                    x=x+1;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={100,4,200,1,3,2};
        System.out.println(longestConsectiveNumber(arr));
    }
}