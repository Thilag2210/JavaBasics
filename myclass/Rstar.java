import java.util.Scanner;
class A{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	 int num=sc.nextInt();
		for(int j=num;j>=0;j--){
		for(int i=1;i<=j;i++){
			System.out.print("*");
			
			
		}
		System.out.println();
		}
		
	}
}