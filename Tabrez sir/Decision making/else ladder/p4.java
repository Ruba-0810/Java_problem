//check the given is vowel or Consonant
import java.util.*;
class p4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        char ch=sc.next().charAt(0);
        if(ch=='A'|| ch=='E'|| ch=='I' || ch=='O' || ch=='U')
        System.out.println(ch+" it is uppercase vowel");
        else if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o' || ch=='u')
        System.out.println(ch+" it is lowercase vowel");
        else
        System.out.println(ch+" it is Consonsnts");
    }
}