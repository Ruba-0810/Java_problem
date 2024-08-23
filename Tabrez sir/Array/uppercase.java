import java.util.*;
class p1{
    public static void main(String[] args){
        char[] ch={'a','*','$','V','C'};
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                ch[i]+=32;
            }else if(ch[i]>='a' && ch[i]<='z'){
               ch[i]-=32;
            }
        }
        System.out.println(Arrays.toString(ch));
    }
}