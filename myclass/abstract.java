import java.util.Scanner;
abstract class A{
	abstract void raj();
}
class B extends A{
	void raj(){
				System.out.println("i am Raj");

	}
	void dinesh(int a){
		System.out.println("i am dinesh"+"value is"+a);
		
	}
}
class C extends B{
	
	void Thilagaraj(){
						System.out.println("i am ThilagaRaj");

	}
}
class D{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		C obj=new C();
		obj.raj();
		obj.dinesh(a);
	}
}