import java.util.*;
class p1{
    public static void main(String[] args){
        int[][] a={
            {1,2,3},
            {4,5,6},
            {6,7,8}
        };
        int[][] b={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[][]c=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            int m=0;
            for(int j=0;j<a[i].length;j++){
                c[i][m]=a[i][j]+b[i][j];
                System.out.print(c[i][m]+" ");
                m++;
            }
            System.out.println();
        }
    }
}
/*
2 4 6 
8 10 12 
13 15 17
*/