/*
https://leetcode.com/problems/add-strings/
Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
*/
import java.util.*;
class p1{
    public static void main(String[]args){
        String n1="77";
        String n2="124";
        StringBuilder str=new StringBuilder();
        int n=n1.length()-1;
        int m=n2.length()-1;
        int carry=0;
        while(n>=0 || m>=0 || carry>0){
            int sum=carry;
            if(n>=0){
              sum=sum+n1.charAt(n)-'0';
              n--;
            }
            if(m>=0){
                sum=sum+n2.charAt(m)-'0';
                m--;
            }
            sum=sum%10;
            str.append(sum);
            carry=sum/10;
        }
        System.out.println(str.reverse().toString());
        }
       
    }
