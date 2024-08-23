import java.util.*;
class p1{
    public static void main(String[] args){
        String res="How are you";
        String[] result=res.split("");
        String ans=result[0];
        for(int i=1;i<result.length;i++){
              if(result[i].equals(" ")){
                ans=ans+result[i+1];
              }
        }
         
         System.out.println(ans);
        
    }
}
/*
Hay
*/