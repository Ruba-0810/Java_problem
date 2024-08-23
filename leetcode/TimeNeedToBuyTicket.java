/*
https://leetcode.com/problems/time-needed-to-buy-tickets/submissions/
Input: tickets = [2,3,2], k = 2
Output: 6
Explanation: 
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.
*/
import java.util.*;
class p1{
    public static int timeNeedToBuyTicket(int[] arr,int k){
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            queue.add(i);
        }
        int time=0;
        while(!queue.isEmpty()){
            time++;
            int front=queue.poll();
            arr[front]--;
            if(front==k && arr[front]==0){
                return time;
            }
            if(arr[front]!=0){
                queue.add(front);

            }
        }
        return time;
    }
    public static void main(String[] args){
        int[] arr={2,3,2};
        int k=2;
       int result=timeNeedToBuyTicket(arr,2);
        System.out.println(result);
    }
}