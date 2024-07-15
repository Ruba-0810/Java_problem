/*output
*/
import java.util.*;
class p1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
        char ch1='Z';
        char ch2='a';
        while(ch1>='A' || ch2<='z'){
            if(ch1>='A'){
                System.out.println(ch1+" - "+(int)(ch1));
                if(ch1=='A'){
                    System.out.println("*****************");
                }
                ch1--;
            }
            else{
                System.out.println(ch2+" - "+(int)(ch2));
                ch2++;
             }
               
            }
        }
       
    }
