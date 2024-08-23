import java.util.*;
class p1{
    public static void main(String[] args){
        String a="Hi How are you?";
        String[] ans=a.split(" ");
        System.out.println(Arrays.toString(ans));
        for(int i=ans.length-1;i>=0;i--){
            System.out.print(ans[i]+ " ");
        }
    }
}
/* REVERSE THE WORDS
[Hi, How, are, you?]
you? are How Hi
*/