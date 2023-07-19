import java.util.Scanner;
class A{
	static void hi(int x){
		if(x%4==0){
			System.out.println(x+"  is leap year");
		}else{
			System.out.println(x+"  is not leap year");

		}
	}
	
	
	
	
	
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");

		int a=sc.nextInt();
		hi(a);
	}
}