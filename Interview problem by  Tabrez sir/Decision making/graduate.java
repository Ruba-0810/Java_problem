/*
Write a program to calculate the salary as per the following table

Gender Year of Service Qualifications Salary

Male >=10 Post Graduate 15000
     >=10  Graduate 10000
      <10  Post-Graduate 10000
      <10   Graduate 7000
Female >=10 Post Graduate 12000
      >=10  Graduate 9000
      <10  Post-Graduate 10000
      <10   Graduate 6000
      */
import java.util.*;
class p16{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
        System.out.println("1.male\n2.Female");
        int gender=sc.nextInt();
        System.out.print("Enter year of experience:");
        int year=sc.nextInt();
        System.out.println("1.Post Graduate\n2. Graduate");
        int post_graduate=sc.nextInt();
        if(gender==1)
        {
        if(year>=10 && post_graduate==1)
        System.out.println("Given salary is 15000");
        else if(year>=10 && post_graduate==2)
        System.out.println("Given salary is 10000");
        else if(year<10 && post_graduate==1)
        System.out.println("Given salary is 20000");
        else
        System.out.println("Given salary is 7000");
        }
        else{
        if(year>=10 && post_graduate==1)
        System.out.println("Given salary is 12000");
        else if(year>=10 && post_graduate==2)
        System.out.println("Given salary is 9000");
        else if(year<10 && post_graduate==1)
        System.out.println("Given salary is 1000");
        else
        System.out.println("Given salary is 6000");
        }

    }
}






