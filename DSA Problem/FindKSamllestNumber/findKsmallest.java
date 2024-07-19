/*
K th Smallest Element in Unsorted Array
Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 3 
Output: 7

Input: arr[] = {7, 10, 4, 3, 20, 15}, K = 4 
Output: 10 
*/
import java.util.*;
class p1{
    public static int findkthSmallestElement(int[] arr,int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args){
        int[] arr={7, 10, 4, 3, 20, 15};//3 4 7 10 20 15
        int k=4;
        System.out.println(findkthSmallestElement(arr,k));

    }
}