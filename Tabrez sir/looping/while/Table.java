// WAJP to print  the table by taking the input
import java.util.*;
class p1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
        int n=sc.nextInt();
		int start=1;
        while(start<=10){
            System.out.println(n+" x "+start+" = "+(n*start));
            start++;
        }
    }
}