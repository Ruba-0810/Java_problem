/*
print from 1 to 100 where if odd number enter println SQL 
with number and if divisible by 6 || 9 found print java along with number
*/
import java.util.*;
class p1{
    static Scanner sc=new Scanner(System.in);
    public static void main(String [] args){
    int start=1;
    int end=100;
        while(start<=end){
            if(start%2!=0){
                System.out.println( start+" SQL ");
            }
            start++;
            if(start%6==0 || start%9==0){
                System.out.println( start+" Java ");
            }
            start++;
        }
    }
}