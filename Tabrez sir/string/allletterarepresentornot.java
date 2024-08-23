import java.util.*;
class p1{
    public static void main(String[] args){
        String s="The quick brown fown jumps over the lazy dog";
        String res=s.toLowerCase();
        char[] ch=res.toCharArray();
        boolean ans=true;
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]!=ch[j])
            }
        }
        if(ans){
            System.out.println("com");
        }
    }
}
ch[i]!