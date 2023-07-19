interface Father{
	abstract void call();
	abstract void talk();
}
class Mother implements Father{
  
		public void call(){
		System.out.println("i am calling");
		}
	public	void talk(){
					System.out.println("i am talking");

}
	void mo(int a){
		System.out.println("Mother here"+a);
	}
}
class Son implements Father{
	public void call(){
		System.out.println("i am calling......");
		}
	public	void talk(){
					System.out.println("i am talking......");

}}
class f{
			public static void main(String []args){
				Son obj=new Son();
				obj.call();
				obj.talk();
				Mother ob=new Mother();
				ob.mo(10);
				ob.call();
				ob.talk();
			}

}