import java.util.*;
class p1{
    public static void main(String[] args){
        int[][] a={
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int[][] b=new int[a.length][a.length];
        for(int i=0;i<a.length;i++){
            int m=0;
            for(int j=a[i].length-1;j>=0;j--){
                 b[i][m]=a[i][j];
                 System.out.print(b[i][m]+ " ");
                 m++;
            }
            System.out.println();
        }
    }
}