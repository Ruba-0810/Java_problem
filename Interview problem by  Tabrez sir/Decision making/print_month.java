/*
Write a program to input month number and print month Name (by using switch)
*/
import java.util.*;
class p11{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=sc.nextInt();
        int res=2;
        switch(res){
            case 1:System.out.println("Jan");
            break;
            case 2:System.out.println("Feb");
            break;
            case 3:System.out.println("March");
            break;
            case 4:System.out.println("April");
            break;
            case 5:System.out.prinltn("May");
            break;
            case 6:System.out.println("June");
            break;
            case 7:System.out.println("July");
            break;
            case 8:System.out.println("Aug");
            break;
            case 9:System.out.println("Sep");
            break;
            case 10:System.out.println("Oct");
            break;
            case 11:System.out.println("Nov");
            break;
            case 12:System.out.println("Dec");
            default:
                System.out.println("Invalid"); 
        }       
    }
}