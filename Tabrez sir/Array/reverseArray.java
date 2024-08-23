import java.util.*;
class p1{
    public static int[] reverseArray(int[] a){
        int size=a.length;
        int[] b=new int[size];
        for(int i=a.length-1;i>=0;i--){
            b[size-i-1]=a[i];
        }
        return b;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        int[] result=reverseArray(a);
        System.out.println(Arrays.toString(result));
    }
}