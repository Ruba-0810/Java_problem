/*
Write a program to check whether a character is uppercase ,lowercase,integer,special character
*/
import java.util.*;
class p10{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
        System.out.println(ch+" it is uppercase letter");
        else if(ch>='a' && ch<='z')
        System.out.println(ch+" it is lowercase letter");
        else if(ch>='0' && ch<='9')
        System.out.println(ch+" it is integer");
        else
        System.out.println(ch+" it is special character");
    }
}