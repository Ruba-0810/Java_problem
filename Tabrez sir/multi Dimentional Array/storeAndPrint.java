import java.util.*;
class p1{
    public static void printMatrix(int[][] a){
        for(int i=a.length-1;i>=0;i--){
            for(int j=0;j<a[i].length;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
            //or
            // if i dont want to use for loop
          // I can you this object
          //System.out.println(Arrays.toString(a[i]));
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        printMatrix(a);
    }
}