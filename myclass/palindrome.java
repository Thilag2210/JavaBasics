import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 int sum=0;
	 int temp=a;
	 
	 
	 
	 while (a>0){
		 int r=a%10;
		 sum=(sum*10)+r;
		  a=a/10;
		 }
		// System.out.println(sum);
	 if(temp==sum){
		 System.out.println("it is pallindrome");
	 }
	 else
		 System.out.println("Not a pallindrome");
	 }}