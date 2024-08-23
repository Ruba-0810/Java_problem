import java.util.*;
class p1{
    public static void main(String[] args){
        int[][] a={
            {1,2,3},
            {4,5,6},
            {7,8,9}
    };
    for(int i=a.length-1;i>=0;i--){
        for(int j=a[i].length-1;j>=0;j--){
            System.out.print(a[i][j]+" ");
        }
        System.out.println();
    }
}
}/*
9 8 7 
6 5 4
3 2 1
*/