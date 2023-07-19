import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter the number");
	 int a=sc.nextInt();
	 int a1=a;
	 
	 if(a>0){
		 int temp=a%10;
		 int r=a/10;
		 temp= temp * temp * temp;
		 int temp1=r%10;
		 int r1=r/10;
			temp1= temp1 * temp1 * temp1;
			int temp2=r1%10;
			temp2=temp2 *temp2*temp2;
			
			int armstrong= temp +temp1+temp2;
			
			if(a1==armstrong){
				System.out.println("This is armstrong number");
			}else{
				System.out.println("This is not armstrong Number");
			}
			
		 
	 }
	 
	 
	 
	 }}