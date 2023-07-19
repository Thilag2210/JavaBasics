import java.util.Scanner;
class A{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	 int num=sc.nextInt();
	 for(int i=0;i<num;i++){
		for(int j=num;j>=i;j--){
		System.out.print(" ");

		}
		for(int k=1;k<=i;k++){
		 System.out.print("* ");

		}
		 System.out.println();
	 }
	 
}}