import java.util.*;
class p{
    public static void main(String[] args){
        String res="Hi how are?";
        int count=0;
        for(int i=res.length()-1;i>=0;i--){
           if(res.charAt(i)!=' '){
            count++;
           }
           else{
            for(int j=0;j<count;j++){
               System.out.print(res.charAt(i+j+1));
            } 
            count=0;
             System.out.print(" ");
           }
        }
        for(int k=0;k<count;k++){
            System.out.print(res.charAt(k));
        }
    }
}