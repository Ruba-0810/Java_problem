/*
https://leetcode.com/problems/fizz-buzz/
Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
*/
import java.util.*;
class p1{
    public static ArrayList<String> fizzBuzz(int n){
        ArrayList<String> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){
                list.add("Fizz");
            }
            else if(i%5==0){
                list.add("Fizz");
            }else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<String> result=fizzBuzz(n);
        System.out.println(result);
    }
}
/*
15
[1, 2, Fizz, 4, Fizz, Fizz, 7, 8, Fizz, Fizz, 11, Fizz, 13, 14, FizzBuzz]
*/