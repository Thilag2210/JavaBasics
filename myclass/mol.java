import java.util.Scanner;
class B{
	void mo(int c){
		System.out.println(c);

	}
	
}
class D extends B{
	void mo(int a,int b,int c){
	System.out.println(a+b);

	}
}
class E extends D{
	void mo(int d,int e){
		System.out.println(d-e);
		
	}
}
class A{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();

		int e=sc.nextInt();
		E obj=new E();
		obj.mo(d,e);
		obj.mo(c);
		obj.mo(a,b,c);
	}
}