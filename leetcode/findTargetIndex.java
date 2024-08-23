/*
. Find Target Indices After Sorting Array
https://leetcode.com/problems/find-target-indices-after-sorting-array/
Input: nums = [1,2,5,2,3], target = 2
Output: [1,2]
Explanation: After sorting, nums is [1,2,2,3,5].
The indices where nums[i] == 2 are 1 and 2.
*/
import java.util.*;
class p1{
    public static List<Integer> targetIndexAfterSorting(int[] arr,int k){
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==k){
                list.add(i);
            }
        }
        return list;
    }
    public static void main(String[] args){
        int[] arr={1,2,5,2,3};
        int k=2;
        List<Integer> result=targetIndexAfterSorting(arr,k);
        System.out.println(result);
    }
}