import java.util.Scanner;
class A{
static	void mo(double x,double y,double z){
	if(x<y&&x<z){
		System.out.println("smallest value is"+x);
	}else if(y<x&&y<z){
		System.out.println("smallest value is "+y);
	}else{
		System.out.println("smallest value is "+z);
	}
		
	double d=x+y+z;
	double avg=d/3;
		System.out.println("the average of 3 number is :"+avg);

	

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