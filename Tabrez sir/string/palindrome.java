import java.util.*;
class p1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        for(int i=s.length()-1;i>=0;i--){
           res=res+s.charAt(i);
        }
        if(s.equals(res)){
            System.out.println("palindrome");
        }else{
             System.out.println("is not palindrome");
        }
    }
}