import java.util.*;
class p1{
    public static int[] merge(int[] arr1,int[] arr2,int n1,int n2){
        int[] newArray=new int[n1+n2];
        for(int i=0;i<newArray.length;i++){
            if(i<n1){
                newArray[i]=arr1[i];
            }else{
                newArray[i]=arr2[i-n1];
            }
        }
        return newArray;
    }
    public static void main(String[] args){
        int[] arr1={1,2,3,4};
        int n1=arr1.length;
        int[] arr2={5,6,7};
        int n2=arr2.length;
        int[] result=merge(arr1,arr2,n1,n2);
        System.out.println(Arrays.toString(result));
    }
}