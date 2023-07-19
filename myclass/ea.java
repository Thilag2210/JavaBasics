import java.util.Scanner;
class A
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
	int i=1;
	 System.out.println("Enter the table number");
	 int a=sc.nextInt();
	 System.out.println("Enter the last value:");
	 int b=sc.nextInt();

	 
	 while(i<=b){
		 int c=i*a;
		 		/* System.out.println(i+"*"+a+"="+c);  
				
				*/
				if(c%2==0){
					
					System.out.println(i+"*"+a+"="+c);  
				}
				
			i++;	
	 }
	

	 
	 
	 
	 }}