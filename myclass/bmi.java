import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the weight");
	 int a=sc.nextInt();
	 double weight=a*0.453;
	 System.out.println("weight is  "+weight);
	 System.out.println("enter the height value:");
	 int b=sc.nextInt();
	 double height=b*0.0254;
	 System.out.println(height);
	 double height1=height*height;
	 System.out.println(height1);
	 System.out.println("height is   "+height1);
	 double bmi=weight/height1    ;
	 System.out.println("bmi is   "+bmi);
	 
	 
	 

	 
	 
	 }}