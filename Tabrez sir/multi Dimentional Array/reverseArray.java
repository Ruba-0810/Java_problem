import java.util.*;
class p1{
    public static void reverseArray(int[][] a){
         int[][]b=new int[3][3];
        for(int i=0;i<a.length;i++){
            int n=0;
           for(int j=a[i].length-1;j>=0;j--){
             b[i][n]=a[i][j];
             System.out.print(b[i][n]+" ");
             n++;
           }
           System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][]a=new int[3][3];
       
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        reverseArray(a);
    }
}