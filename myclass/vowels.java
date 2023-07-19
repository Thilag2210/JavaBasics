import java.util.Scanner;
class A{
static int bye(String s){
	int count=0;
	for(int i=0;i<s.length();i++){
		if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'){
					//System.out.println(s.charAt(i));
					count++;
		}
	}
			return count;

	
}


public static void main(String []args){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.nextLine();
	int total=bye(str);
	System.out.println(total);
}
}