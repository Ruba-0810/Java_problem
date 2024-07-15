//Divide by 2 & 6
class p1
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String [] args){
		int start=1;
		while(start<100){
		 if(start%2==0 && start%6==0){
			 System.out.print(start+" ");
		}
		start++;
	}
  }
}