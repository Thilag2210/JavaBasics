import java.util.Scanner;
class B{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b=sc.nextInt();
		if(a>b){
		System.out.println(a+"  is greatest than b");
		}else
		System.out.println(b+"  is greatest than a");
		


	}
	
}