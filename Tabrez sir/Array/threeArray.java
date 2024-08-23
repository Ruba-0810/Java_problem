import java.util.*;
class p1{
    public static int[] threeArray(int[]arr1,int[] arr2,int[] arr3){
        int n=arr1.length;
        int m=arr2.length;
        int s=arr3.length;
        int index=0;
        int[] temp=new int[n+m+s];
            for(int j=0;j<n;j++){
                temp[index]=arr1[j];
                index++;
            }
            for(int k=m-1;k>=0;k--){
                temp[index]=arr2[k];
                index++;
            }
            for(int r=0;r<s;r++){
                temp[index]=arr3[r];
                index++;
            }
        return temp;
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4,5};
        int[] arr2={6,7,8,9};
        int[] arr3={10,11,12};
        int[] result=threeArray(arr1,arr2,arr3);
        System.out.println(Arrays.toString(result));
    }
}