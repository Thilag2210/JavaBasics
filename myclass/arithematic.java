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
		System.out.println("Enter the 4nd value");
		int d=sc.nextInt();
		
		System.out.println("Enter the 5rd value:");
		int e=sc.nextInt();
		
		int sum=a+b+c+d+e;
		int sub=a-b-c-d-e;
		int mul=a*b*c*d*e;
		int div=a/b/c/d/e;
	 System.out.println("Sum of 5 value is" + sum);
	 System.out.println("Sub of 5 value is" + sub);
	 System.out.println("mul of 5 value is" + mul);
	 System.out.println("div of 5 value is" + div);


		
		
	}
}
		