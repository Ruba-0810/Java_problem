import java.util.*;
class p1{
    public static void main(String[] args){
        int[][] a={
                    {1,2,3,5},
                    {3,6,5,9,9,3,4},
                    {1,3,4,5,6,7}
                   };
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
