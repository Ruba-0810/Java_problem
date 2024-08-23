import java.util.*;
class p1{
    public static void main(String[] args){
        String s="hello";
        char[] ch=s.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            int count=1;
            char visited='\0';
            if(ch[i]!=visited){
                for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    ch[j]=visited;
                    count++;
                }
            }
             System.out.println(ch[i]+" "+count);

            }
        }
    }
}
/*
h 1
e 1
l 2
o 1
*/