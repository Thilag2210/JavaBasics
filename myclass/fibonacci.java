import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 int n1=0;
	 int n2=1;
	 System.out.println(n1);
	 	 System.out.println(n2);

	 
	 for(int i=1;i<=a;i++){
		 int n3=n1+n2;
		 System.out.println(n3);
		 n1=n2;
		 n2=n3;
	 }
	 
	 
	 
	 }}