import java.util.*;
class p1{
    public static int[] copyArray(int[] arr){
        int size=arr.length;
        int[] newArray=new int[size];
        for(int i=0;i<size;i++){
            newArray[i]=arr[i];
        }
        return newArray;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println(Arrays.toString(arr));
        System.out.print("new Array :"); 
        int[] result=copyArray(arr);
        System.out.println(Arrays.toString(result));
    }
}