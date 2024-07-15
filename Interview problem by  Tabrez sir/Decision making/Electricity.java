/*
Write a program to input ef electricity unit tharges and calculate total electricity according to the given conditions

With in 50 amts Rs. 0.50unit

within 150 units Rs 0.75unit

With in 250 units Rs. 1.20unit

above 250 Rs. 1.50unit

An additional tax of 20% is add to the b
*/
import java.util.*;
class p13{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the unit:");
        int unit=sc.nextInt();
        float amount=0f;
        if(unit<=50)
        amount=unit*0.50f;
        else if(unit<=150) 
        amount=unit*0.75f;
        else if(unit<250)
        amount=unit*1.20f;
        else
        amount=unit*1.50f;
        float tax =amount*0.2f;
        float total=amount*tax;
        System.out.println("Tax of electricity :"+tax);
         System.out.println("Tax of electricity :"+total);

    }

}