/*
[1,2,3,5,6,78]-->INPUT
78-->OUTPUT
*/
import java.util.*;
class p1{
    public static int largstNumber(int[] arr){
      int largest=arr[0];
      for(int i=1;i<arr.length;i++){
        if(largest<arr[i]){
            largest=arr[i];
        }
      }
      return largest;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(largstNumber(arr));
    }
}
