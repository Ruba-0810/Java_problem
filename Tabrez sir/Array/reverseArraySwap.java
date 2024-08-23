import java.util.*;
class p1{
    public static void reverseArray(int[] a){
        
        int i=0;
        int j=a.length-1;
        while(i<j){
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }
        return ;
    }
    public static void main(String[] args){
        int[] a={1,2,3,4,5};
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }
}