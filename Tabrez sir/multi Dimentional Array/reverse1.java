import java.util.*;
class p1{
    public static void main(String[] args){
        int[][] a={
            {1,2,3,4},
            {5,6,7,8},
            {1,2,3,4},
            {5,6,7,8}
        };
       for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }
       }
    }

/*
[1, 5, 1, 5]
[2, 6, 2, 6]
[3, 7, 3, 7]
[4, 8, 4, 8]
*/   

































