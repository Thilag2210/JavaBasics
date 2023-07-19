import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter the 1st value");
	 int a=sc.nextInt();
	 System.out.println("Enter the 2nd value");
	 int b=sc.nextInt();
	 System.out.println("Enter the case Number:");
	 int num=sc.nextInt();
	 
	 
	 switch(num){
	 case 1:
	 int c=a+b;
	  System.out.println(" the sum of two value is" + c);
	   break;
	  case 2:
	  int d=a-b;
	   System.out.println("the sub of two value is" +d);
	    break;
	   case 3:
	   int e=a*b;
	    System.out.println("the mul of two value is"+ "  "+e);
		 break;
		case 4:
		int f=a/b;
		 System.out.println("the div of two value is"+ f);
		  break;
		 case 5:
		 int g=a%b;
		  System.out.println("the mod of two value is "+g);
		  break;
		  default:
		   System.out.println("invalid");
	 }
	 
	 
	 
	 }}