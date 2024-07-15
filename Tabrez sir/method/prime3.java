import java.util.Scanner;
class p1{
    public static String isPrimeOrNot(int n){
    int count=2;
    for(int i=2;i<n;i++){
         if(n%i==0){
             count++;
          }
      }
      if(count==2){
        return "Prime Number";
      }
       return "Not prime number";
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String result=isPrimeOrNot(n);
        System.out.println(result);
    }
}