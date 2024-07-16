import java .util.*;
class p1{
    public static int[] productOfIthElement(int[] arr){
         int[] temp=new int[arr.length];
         for(int i=0;i<arr.length;i++){
            int sum=1;
            for(int j=0;j<arr.length;j++){
                if(j!=i){
                    sum=sum*arr[j];
                }
            }
            temp[i]=sum;
         }
         return temp;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4};
        int[] result=productOfIthElement(arr);
        System.out.println(Arrays.toString(result));
    }
}