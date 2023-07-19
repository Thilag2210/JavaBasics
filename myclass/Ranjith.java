import java.util.Scanner;
class A 
{
	static int a,b;
	int c,d;
}
class C{
	static int e;
	int f;
	public static void main (String[] args)
	{
		
		e=10;
		System.out.println(e);
		C obj= new C ();
		obj.f=20;
		System.out.println(obj.f);
		
	Scanner sc= new Scanner (System.in);
	System.out.println("Enter the a value");
	 A.a = sc.nextInt();
	 System.out.println("Enter b value");
	 A.b = sc.nextInt();
	 int i =A.a+A.b;
	 System.out.println(i);
	 A aa= new A ();
	 System.out.println("Enter c value");
	 aa.c=sc.nextInt();
	System.out.println("Enter d value");
	aa.d= sc.nextInt();
	int j=aa.c+aa.d;
	System.out.println(j);
	System.out.println("Addition of two Static values"+i+e);
	System.out.println("Addition of two instance values"+j+obj.f);
	System.out.println(e*obj.f);
	}
}
	