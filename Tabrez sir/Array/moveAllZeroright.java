import java.util.*;
class p1{
    public static void moveAllZero(int[] arr){
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
               arr[count]=arr[i];
               count++;
            }
          }
          while(count<n){
            arr[count]=0;
            count++;
          }
        }
    public static void main(String[] args){
        int[] arr={1,0,2,0,0,0,4,5,6,7,8};
        moveAllZero(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}
