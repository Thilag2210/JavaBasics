import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 for( int i=0;i<=a;i++){
		 for(int j=a;j>=i;j--){
			 System.out.print(" ");
		 }
		 for(int k=1;k<=i;k++){
			  System.out.print("*");
		 }
		  System.out.println();
		 
	 
	 }
}}