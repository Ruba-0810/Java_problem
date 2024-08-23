import java.util.*;
class p1{
    public static char[] collectLetter(char[] arr)
    {
        int n=arr.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                count++;
            }
        }

        char[] newArray=new char[count];
        int k=0;
        for(int i=0;i<n;i++){
            if(arr[i]>='a' && arr[i]<='z'){
                newArray[k]=arr[i];
                k++;
            }
        }
        return newArray;
    }
    public static void main(String[] args){
        char[] arr={'a','g','9','&','#','c','d'};
        char[] result=collectLetter(arr);
        System.out.println(Arrays.toString(result));
    }
}