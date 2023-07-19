import java.util.Scanner;
class Ab{
	static int c;
	static int d;
	int x;
	int y;
	
}

class A{
	static int a;
	int b;
public static void main(String []args){
A obj=new A();
a=10;
obj.b=5;
System.out.println(A.a);
System.out.println(obj.b);
Ab ob=new Ab();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the 1st instance");

 ob.x=sc.nextInt();
 System.out.println("Enter the 2nt instance");

 ob.y=sc.nextInt();
 
  System.out.println("Enter the 1st Static value");
 Ab.c=sc.nextInt();
 System.out.println("Enter the 2nt Static value");
 Ab.d=sc.nextInt();
 
 System.out.println("sum of 2 static value: + 1st static value");
 
 int i=Ab.c + Ab.d;
 
 System.out.println(i+A.a);
 System.out.println(" sum of 2 instance value:+ 1st instance value");
 int j=ob.x + ob.y;
  System.out.println(j+obj.b);
   System.out.println("2nd class static * sum of instance   "+A.a*j);
  }
}