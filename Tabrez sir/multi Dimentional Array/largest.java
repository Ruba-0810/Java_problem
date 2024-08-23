import java.util.*;
class p1{
    public static int findlargest(int[] b){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<b.length;i++){
            if(max<b[i]){
               max=b[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[][] a={
            {6,26,33, 10},
            {41,83,46,98},
            {8,94,83,63},
            {2,64,14,44}
        };
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a[i].length;j++){
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<a.length;i++){
            int res=findlargest(a[i]);
            System.out.println(res);
        }
    }
}