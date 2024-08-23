import java.util.*;
class p1{
    public static int[] zigzig(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int[] temp=new int[n+m];
        int j=0;
        int k=0;
        for(int i=0;i<n+m;i++){
            if(i%2==0){
                temp[i]=arr1[j];
                j++;
            }else{
                temp[i]=arr2[k];
                k++;
            }
        }
        return temp;
    }
    public static void main(String[] args){
        int[] arr1={2,4,6,8};
        int[] arr2={10,12,14,16};
        int[] result=zigzig(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
}