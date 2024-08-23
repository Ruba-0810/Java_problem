import java.util.*;
class p1{
    public static int[] sortArray(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return a;
    }
   
    public static void main(String[] args){
        int[][] a={
            {5,2,8,7},
            {1,8,6},
            {45,43,16,84},
            {2,6,24,11}
        };
       for(int i=0;i<a.length;i++){
         int[] ans=sortArray(a[i]);
         //System.out.println(Arrays.toString(ans));
         for(int j=0;j<ans.length;j++){
            System.out.print(ans[j]+" ");
         }
         System.out.println();
       }
    }
}
/*
[2, 5, 7, 8]
[1, 6, 8]
[16, 43, 45, 84]
[2, 6, 11, 24]
*/