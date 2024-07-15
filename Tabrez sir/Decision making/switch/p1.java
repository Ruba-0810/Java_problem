/*check vowel or consonent by using switch
OUTPUT:1
Enter the character:I
vowel
********************************************************************
OUTPUT:2(break is insert in I so like this  [case 'I':break])
ans:Enter the character:I

*/
import java .util.*;
class p1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the character:");
        char ch=sc.next().charAt(0);
         switch(ch){
            case 'A':
            case 'E':
            case 'I':break;
            case 'O':
            case 'U':
                System.out.println("vowel");
                break;
            default:
                System.out.println("consonent");
         }
    }
}