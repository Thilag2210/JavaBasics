import java.util.Scanner;
class A{
static	void prime(int x){
	for(int i=2;i<=x;i++){
		int count=0;
		for(int j=2;j<i;j++){
			if(i%j==0){
				count++;
			}
		}
		if(count==0){
			System.out.println(i);
		}
	}
	}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	
	 System.out.println("Enter 1st number");
	 int a=sc.nextInt();
	 
	prime(a);
	
}}