import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void details(int[] arr,int n){
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt(); 
        }
        for(int i=n-1;i>=0;i--){
            System.out.println(arr[i] +" ");
        }
         System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args){
        int size=sc.nextInt();
        int[] arr=new int[size];
        details(arr,size);
    }
}