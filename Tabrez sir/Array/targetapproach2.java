import java.util.*;
class p1{
    public static void target(int[] arr,int k){
       int n=arr.length;
       HashSet<Integer>set=new HashSet<>();
       for(int i=0;i<n;i++){
        int target=k-arr[i];
        if(set.contains(target)){
            System.out.println("[" +target+ " " +arr[i]+"]");
        }
        set.add(arr[i]);
       }
    }
    public static void main(String[] args){
        int[] arr={8,3,4,2,6,1,5};
        int k=10;
        target(arr,k);
    }
}