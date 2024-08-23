import java.util.*;
class p1{
    public static void smallest(int[][]a){
        for(int i=0;i<a.length;i++){
            int max=Integer.MAX_VALUE;
            for(int j=0;j<a[i].length;j++){
               if(max>a[i][j]){
                  max=a[i][j];
               }
            }
            System.out.println(max);
        }
    }
    public static void main(String[] args){
        int[][] a={

            {8,3,4,16},
            {16,4,2,18},
            {9,2,1,45}
        };
        smallest(a);
    }
}