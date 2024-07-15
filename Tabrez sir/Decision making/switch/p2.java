/*week day
Enter the number:1
1.6.00AM
2.12.00PM
Enter the number:2
Sunday
12.00PM
*/
import java.util.*;
class p2{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number:");
        int n=sc.nextInt();
        System.out.println("1.6.00AM\n2.12.00PM");
        System.out.print("Enter the number:");
        int s=sc.nextInt();
        int day=1;
        switch(day){
            case 1:{
                System.out.println("Sunday");
                if(s==1)
                System.out.println("6.00AM");
                else
                System.out.println("12.00PM");
                break;
            }
            case 2:{
                System.out.println("Monday");
                break;
            }
            case 3:{
                System.out.println("Tuesday");
                break;
            }
            case 4:{
                System.out.println("Wednesday");
                break;
            }
            case 5:{
                System.out.println("Thursday");
                break;
            }
            case 6:{
                System.out.println("Friday");
                break;
            }
            case 7:{System.out.println("Saturday");
            break;
            }
            default:
                System.out.println("Invalid");
        }
    }
}