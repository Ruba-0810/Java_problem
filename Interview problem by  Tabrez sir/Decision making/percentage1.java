/*
Read Marks of student in 5 different subjects. Display the division obtained by the student

Percentage above or equal to 60-Fest division

Percentage between 50 and 59 Second division

Percentage between 40 and 49 Thed division

Percentage less than 40-Fail

*/
import java.util.*;
class p15{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
       System.out.print("Enter mark of tamil:");
       int tamil=sc.nextInt();
       System.out.print("Enter mark of english:");
       int english=sc.nextInt();
       System.out.print("Enter mark of maths:");
       int maths=sc.nextInt();
       System.out.print("Enter mark of science:");
       int science=sc.nextInt();
       System.out.print("Enter mark of social:");
       int social=sc.nextInt();

       double total=(double)(tamil+english+maths+science+social)/5*100;//----->add all mark and divide by total Subject *100 and multiple with 100
       double Percentage=total*100;
       if(Percentage>=60)
       System.out.println("Firt mark");
       else if(Percentage>50 && Percentage<59)
       System.out.println("Second marks");
       else if(Percentage>40 && Percentage<49)
       System.out.println("Third marks");
       else
        System.out.println("Fail");
    }
}