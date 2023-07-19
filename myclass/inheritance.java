class A{
	void english(){
		System.out.println("Hi i am english");
	}
}
class B extends A{
	void tamil(){
		System.out.println("Hi i am tamil");
	}
}
class D extends A{
	void maths(){
				System.out.println("Hi i am maths");

	}
}
class C{
	public static void main(String []args){
		D obj=new D();
		obj.english();
	}
}