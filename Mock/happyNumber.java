import java.util.*;
class p1{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          boolean ruba=false;
          if(n==1 && n==4){
            ruba=true;
          }
          while(n!=1 && n!=4){
            int ans=n;
             int sum=0;
             while(ans>0){
              int last=ans%10;
              sum=sum+last*last;
              ans=ans/10;
             }
             n=sum;
             if(n==1){
                ruba=true;
                break;
             }
          }
          if(ruba){
            System.out.println("Happy number");
          }else{
              System.out.println("Not Happy number");
          }
         
    }
}