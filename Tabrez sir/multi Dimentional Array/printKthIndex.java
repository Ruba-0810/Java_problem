import java.util.*;
class p1{
    public static int printKthelement(int[]a,int k){
        for(int i=0;i<a.length;i++){
            if(k==a[i])
            return i;
        }
        return -1;
    }
    public static void main(String[] args){
        int[][] a={
            {8,4,16,24},
            {2,7,6},
            {2,6,4,8,9,24}
        };
        for(int i=0;i<a.length;i++){
            if(i==0){
               int ans=printKthelement(a[i],4);
               System.out.println(ans);
            }else if(i==1){
                int ans=printKthelement(a[i],6);
                System.out.println(ans);
            }else{
                int ans=printKthelement(a[i],24);
                System.out.println(ans);
            }
        }
    }
}