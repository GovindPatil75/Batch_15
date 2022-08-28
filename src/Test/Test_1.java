package Test;

public class Test_1 {
	
	int b=40; // instance --Non static 
	static int c=50;

	public static void main(String[] args) {
		
		int a=10;  // local 
		
		
		System.out.println(a);
		Test_1 test=new Test_1(); // Object 
		
		System.out.println(test.b);
		System.out.println(Test_1.c);
		
		

	}

}
