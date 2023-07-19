import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 System.out.println("Please select Even or odd:"+ "Even means 1 or odd means 2"  );
	 int even=sc.nextInt();
	
	 	 System.out.println("The even number is:");

	 switch(even){
		 case 1:
	 
	 for(int i=1;i<=a;i++){
		 if(i%2==0){
			 System.out.println(i);
		
		 }
		 }
		 break;
		 
		  case 2:
		 System.out.println("The odd number is:  ");
		  for(int i=1;i<=a;i++){
		 if(i%2!=0){
			 System.out.println(i);
			 
		 }
		 
		 }
		 break;
		  default:
		   System.out.println("invalid");
	 }
	 
	 }}
	 
	 
	 
	 
	 
	 