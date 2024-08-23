import java.util.*;
class p1{
    public static String duplicateElement(int[] arr){
        int n=arr.length;
        int visited=Integer.MIN_VALUE;
        String ans="";
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
               if(arr[i]==arr[j]){
                count++;
                break;
               } 
            }
            if(count>0){
                ans=ans+arr[i] + " ";
            }
        }
        if(ans==""){
            return "not Duplicate";
        }
        return ans;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,4,3,0,0};
        System.out.println(duplicateElement(arr));
    }
}