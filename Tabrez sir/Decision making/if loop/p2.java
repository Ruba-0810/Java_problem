// read character and present ASCi
import java.util.*;
class p2{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the Character:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='z')
        System.out.println((int)(ch));
    }
}