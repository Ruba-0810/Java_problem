/*
 A certain grade of steel is graded according to the following conditions
Hardness must be greater then 50
Carbon content must be less than 0.7
Tensile strength must be greater than 5000
The gradus me as follows

Grade  10 if all three conditions are met
Grade  9 if conditions 1 and 2 are met
Grade  8 il conditions 2 and 3 are met
Grade  7 if conditions 1 and 3 are met
Grade  6 it only one condition is met
Grade  5 it none of the conditions are met
When a program, which will require the user to give values of 
handress, carbon con and terisile strengtffof the steel under consideration and 
output the grade of the satel
*/
import java.util.*;
class p18{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.print("Enter the Hardness of stell:");
        int hardness=sc.nextInt();
        System.out.println("Enter the Carbon of stell");
        double carbon=sc.nextDouble();
        System.out.println("Enter the Tensile of stell");
        int tensile=sc.nextInt();
        if(hardness>5000 &&  carbon<0.7 && tensile>5000)
        System.out.println("Grade  10");
        else if(hardness>5000 &&  carbon<0.7 )
        System.out.println("Grade 9");
        else if(carbon<0.7 && tensile>5000)
        System.out.println("Grade 8");
        else if(hardness>5000 && tensile>5000)
        System.out.println("Grade 7");
        else if(hardness>5000 || tensile>5000 || carbon<0.7)
        System.out.println("Grade 6");
        else
        System.out.println("Grade 5");


    }
}