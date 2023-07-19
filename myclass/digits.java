import java.util.Scanner;
class A{
	static void hi(int x){
		int rem=x%10;
		int div=x/10;
		if(rem%2==0){
			System.out.print("");
		}else
			System.out.print("");
		int rem1=div%10;
		int div1=div/10;
		//int rem2=div1%10;
		//int div2=div1/10;
			//	int rem3=div2%10;

/*if(rem%2==0&&rem1%2==0&&rem2%2==0&&rem3%2==0){
				System.out.println("False");

}
else{
				System.out.println("True");

}*/
		if(rem1%2==0){
			System.out.print("");
		}else
			System.out.print("");
		int rem2=div1%10;
		int div2=div1/10;
		if(rem2%2==0){
			System.out.print("");
		}else
			System.out.print("");
		int rem3=div2%10;
		
		if(rem3%2==0){
			System.out.print("");
		}else
			System.out.print("");
		int total= (rem+rem1+rem2+rem3)/2;
		if(total%2==0){
			System.out.println("true");
		}
		else{
			System.out.println("False");
		}
		}
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");

		int a=sc.nextInt();
		hi(a);
	}
}