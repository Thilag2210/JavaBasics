import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the name");
	 String name=sc.nextLine();
	 System.out.println("Enter the age");
	 int age=sc.nextInt();
	 System.out.println("Enter the experience");
	 int experience=sc.nextInt();
	 System.out.println("Enter the salary");
	 int salary=sc.nextInt();
	 if(age>=25&& age<=29&&experience>=5&&salary>=15000){
		 System.out.println("you are eligible for 5k bonus");
		 
	 }else if(age>=30&& age<=44&&experience>=10&&salary>=30000){
		 System.out.println("you are eligible for 10k bonus");
		 
	 }else 	 if(age>=45&&experience>=15&&salary>=50000){
		 System.out.println("you are eligible for 15k bonus");
		 
	 }else {
		 System.out.println("Invalid Details");
	 }
	 
	 
	 }}