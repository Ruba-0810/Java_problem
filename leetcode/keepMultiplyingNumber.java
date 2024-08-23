/*
https://leetcode.com/problems/keep-multiplying-found-values-by-two/
Input: nums = [5,3,6,1,12], original = 3
Output: 24
Explanation: 
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.

import java.util.*;
class p1{
    public static int keepMultiplyNumber(int[] arr,int k){
        int res=k;
        for(int i=0;i<arr.length;){
            if(arr[i]==res){
                res=res*2;
                i=0;
            }else{
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args){
      int[] arr={5,3,6,1,12};
      int k=3;
      int result=keepMultiplyNumber(arr,k);
      System.out.println(result);
    }
}
*/
import java.util.*;
class p1{
    public static int keepMultipe(int[] arr,int n){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        int cont=n;
        while(set.contains(cont)){
            cont=cont*2;
        }
        return cont;
    }
    public static void main(String[] args){
        int[] arr={5,3,6,1,12};
        int n=3;
        int result=keepMultipe(arr,n);
        System.out.println(result);
    }
}