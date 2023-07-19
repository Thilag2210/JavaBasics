import java.util.Scanner;
class A{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the 1st value:");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b=sc.nextInt();
		
		System.out.println("Enter the 3rd value:");
		int c=sc.nextInt();
		if(a>b&&a>c){
			System.out.println(a+"  ia greatest");
			}else if(b>a&&b>c){
				System.out.println(b+"  is greatest");
			}else
				System.out.println(c+"   c is greatest");
		
	}
}