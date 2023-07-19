interface Father{
	abstract void call();
	abstract void talk();
}
interface Mother{
	abstract void call();
	abstract void talk();
}
class Son implements Father,Mother{
	public void call(){
		System.out.println("i am calling");
		}
	public	void talk(){
					System.out.println("i am talking");

		}
			public static void main(String []args){
				Son obj=new Son();
				obj.call();
				obj.talk();
			}

}