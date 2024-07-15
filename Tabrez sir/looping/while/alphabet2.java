import java.util.*;
class p1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
        char ch1='A';
        char ch2='a';
        while(ch1<='Z' || ch2<='z'){
            if(ch1<='Z'){
                System.out.println(ch1+" - "+(int)(ch1+32));
                if(ch1=='Z'){
                    System.out.println("*****************");
                }
                ch1++;
            }
            else{
                System.out.println(ch2+" - "+(int)(ch2-32));
                ch2++;
             }
               
            }
        }
       
    }
