package Test;

public class Test_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="Test";
		
		s1=s1.concat("Test_Bug"); // TestTest_Bug
		System.out.println(s1);
		
		String s2="Pune";
		String s3="Pune";
		String s4="Pune";   // SCP ---> Pune ---> s2,s3,s4

	}

}
