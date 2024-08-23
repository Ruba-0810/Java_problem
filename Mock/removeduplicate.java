import java.util.*;
class p1{
    public static LinkedHashSet<Integer> removeDuplicate(int[] arr){
        LinkedHashSet<Integer>set=new LinkedHashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set;
    }
    public static ArrayList<Integer> oddNumber( LinkedHashSet<Integer> result){
        ArrayList<Integer> odd=new ArrayList<>();
        for(int i: result){
            if(i %2!=0){
                odd.add(i);
            }
        }
        return odd;
    }
     public static ArrayList<Integer> evenNumber( LinkedHashSet<Integer> result){
        ArrayList<Integer> even=new ArrayList<>();
        for(int i: result){
            if(i %2==0){
                even.add(i);
            }
        }
        return even;
    }
   
    public static void main(String[] args){
        int[] arr={4,9,7,2,9,10,11};
        LinkedHashSet<Integer> result=removeDuplicate(arr);
        System.out.println(result);
        ArrayList<Integer> answer=oddNumber(result);
         System.out.println(answer);
          ArrayList<Integer> ans=evenNumber(result);
         System.out.println(ans);
         

    }
}