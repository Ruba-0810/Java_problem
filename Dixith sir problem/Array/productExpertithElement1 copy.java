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