import java.util.Scanner;
class A{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("person living over all days:");
		int a=sc.nextInt();
		int dob=a/365;
		System.out.println("The person DoB is  "+dob);
		int min=a*24*60;
		
		
		System.out.println("The person Min is  "+min);
		int Sec=a*24*60*60;
				System.out.println("The person Sec is  "+Sec);

		int hours=a*24;
	 System.out.println("The person Hours is  "+hours);


		
		
}}