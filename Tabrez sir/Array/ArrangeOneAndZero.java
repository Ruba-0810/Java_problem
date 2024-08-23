import java.util.*;
class p1{ 
    public static void ArrangeOneAndZero(int[] arr){
        int n=arr.length;
        int zero=0;
        int one=0;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
               zero++;
            }
            else if(arr[i]==1){
                one++;
            }
        }
        int[] temp=new int[n-(zero+one)];
        int index=0;
        for(int i=0;i<n;i++){
             if(arr[i]!=0 && arr[i]!=1){
                temp[index]=arr[i];
                index++;
             }
        }
        for(int i=0;i<zero;i++){
            arr[i]=0;
        }
        for(int i=0;i<temp.length;i++){
            arr[zero+i]=temp[i];
        }
        for(int i=zero+one;i<n;i++){
            arr[i]=1;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int[] arr={8, 2, 0, 1, 4, 1, 0, 5, 1, 2, 0, 1};
        ArrangeOneAndZero(arr);
    }
}