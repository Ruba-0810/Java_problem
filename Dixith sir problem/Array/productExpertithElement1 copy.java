/*
 * Given an array nums of n integers where n > 1, 
 * return an array output such that output[i] is equal to 
 * the product of all the elements of nums except nums[i].

    Test Case 1: 

	Input: [1, 2, 3, 4] 
Output: [24, 12, 8, 6]


Test Case 2: 

	Input: [2, 3, 4, 5]
Output: [60, 40, 30, 24]


 */
import java .util.*;
class p1{
    public static int[] productOfIthElement1(int[] arr){
         int[] temp=new int[arr.length];
         
         int product=1;
         for(int i=0;i<arr.length;i++){
            product=product*arr[i];
         }
         
         for(int i=0;i<arr.length;i++){
             temp[i]=product/arr[i];
         }
         return temp;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] result=productOfIthElement1(arr);
        System.out.println(Arrays.toString(result));
    }
}