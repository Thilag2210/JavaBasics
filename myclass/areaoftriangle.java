import java.util.Scanner;
class A{
static	void mo(double x,double y,double z){
	double s=(x+y+z)/2;
	double d=(s*(s-x)*(s-y)*(s-z));
	
	
		double area=Math.sqrt(d);
		System.out.println("the area of triangle is:"+area);

	

	}


public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter 1st number");
	 int a=sc.nextInt();
	 System.out.println("Enter 2nd number");
	 int b=sc.nextInt();
	 System.out.println("Enter 3rd number");
	 int c=sc.nextInt();
	 
	mo(a,b,c);
	
}}