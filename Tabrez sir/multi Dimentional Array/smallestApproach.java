import java.util.*;
class p1{
    public static void smallest(int[]a){
        int max=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
               if(max>a[i][j]){
                  max=a[i][j];
               }
            }
            return max
        }
    public static void main(String[] args){
        int[][] a={

            {8,3,4,16},
            {16,4,2,18},
            {9,2,1,45}
        };
        for(int i=0;i<a.length;i++){
            int ans=smallest(a[i]);
            System.out.println(ans);
        }
    }
}