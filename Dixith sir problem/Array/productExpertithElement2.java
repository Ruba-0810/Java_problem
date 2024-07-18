/*
IF ARRAY CONTAIN INCLUDING ZERO USE THIS METHOD

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
        int product=1;
        boolean ruba=false;
        int[] temp=new int[arr.length];
        
          for(int i=0;i<arr.length;i++){
             if(arr[i]!=0){
              product=product*arr[i];
             }else{
                 ruba=true;
             }
            }
            if(ruba){
                 for(int i=0;i<arr.length;i++){
                   if(arr[i]==0){
                    temp[i]=product;
                   } 
                 }

            }else{
                for(int i=0;i<arr.length;i++){
                   temp[i]=product/arr[i];
                }
            }
            return temp;
    }
    public static void main(String[] args){
        int[] arr={0,2,3,0};
        int[] result=productOfIthElement1(arr);
        System.out.println(Arrays.toString(result));
    }
}