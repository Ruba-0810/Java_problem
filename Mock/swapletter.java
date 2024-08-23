import java.util.*;
class p1{
    public static void main(String[] args){
        String s="I Loved  India and Pakistan";
        String[] ans=s.split(" ");
        for(int i=0;i<ans.length-1;i++){
            int result1=reverse(ans[i]);
            if(result1==5){
                for(int j=i+1;j<ans.length;j++){
                    int result2=reverse(ans[j]);
                     if(result2 == 5){
                       String temp=ans[i];
                       ans[i]=ans[j];
                       ans[j]=temp;
                       break;
                     }
                }
            }
        }
        System.out.println(Arrays.toString(ans));
    }
 
    public static int reverse(String s){
        return s.length();
    }
}