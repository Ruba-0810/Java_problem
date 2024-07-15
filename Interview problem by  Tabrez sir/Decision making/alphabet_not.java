/*Write a program to check whether a character is alphabet or not
Ouput:
Enter the value:%
% is not an alphabet
*/
import java.util.*;
class p7{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='z')
        System.out.println(ch+" is an alphabet");
        else
        System.out.println(ch+" is not an alphabet");
    }
}