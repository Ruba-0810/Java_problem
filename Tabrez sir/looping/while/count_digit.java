//count digit
import java.util.*;
class p1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}