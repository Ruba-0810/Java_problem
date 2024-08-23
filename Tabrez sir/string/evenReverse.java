import java.util.*;
class p1{
    String answer="";
    public static String reverse(String str){
        for(int i=str.length();i>=0;i--){
            answer=answer+str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        String s="This Is india wE LOvE It";
        char[] ch=s.toCharArray();

        String ans="";
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ans=ans+(char)(ch[i]+32);
            }else if(ch[i]==' '){
                ans=ans+' ';
            }
            else{
                ans=ans+(char)(ch[i]-32);
            }
        }
       String[] str=ans.split(" ");
       String result="";
       for(int i=str.length;i>=0;i--){
            if(i%2==0){
                result=result+reverse(str[i]);
            }else{
                result=result+str[i];
            }
       }
       System.out.println(result);
    }
}