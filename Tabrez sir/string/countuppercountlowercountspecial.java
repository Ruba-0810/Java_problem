import java.util.*;
class p1{
    public static void main(String[] args){
        String s="A$abcDM86c";
        int count1=0;
        int count2=0;
        int count3=0;
        int count4=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A'&& ch[i]<='Z'){
                count1++;
            }else if(ch[i]>='a'&& ch[i]<='z'){
               count2++;
            }else if(ch[i]>='1' && ch[i]<='9'){
                count3++;
            }else{
                count4++;
            }
        }
        System.out.println(count1);
         System.out.println(count2);
          System.out.println(count3);
           System.out.println(count4);
    }
}