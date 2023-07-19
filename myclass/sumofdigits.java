import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the value");
	 int a=sc.nextInt();
	int b=a%10;
	int c=a/10;
	int d=c%10;
	int e=c/10;
	
	int sum= b+d+e;
	 System.out.println(sum);
	
	}}
	