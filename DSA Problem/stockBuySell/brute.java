
/*
Stock Buy And Sell
Example 1:
Input:
 prices = [7,1,5,3,6,4]
Output:
 5
Explanation:
 Buy on day 2 (price = 1) and 
sell on day 5 (price = 6), profit = 6-1 = 5.

Note
: That buying on day 2 and selling on day 1 
is not allowed because you must buy before 
you sell.

Example 2:
Input:
 prices = [7,6,4,3,1]
Output:
 0
Explanation:
 In this case, no transactions are 
done and the max profit = 0.
*/
import java.util.*;
class p1{
    public static int stockBuySell(int[] arr,int n){
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                   max=Math.max(max,arr[j]-arr[i]);
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
      int[] arr={7,6,4,3,1};
      int n=arr.length;
      System.out.println(stockBuySell(arr,n));
    }
}