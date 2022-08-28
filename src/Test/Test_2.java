package Test;

public class Test_2 {

	public static void main(String[] args) {
		
		String s1=new String("test");
		String s2="Test";
		String s3="Test";
		
		// heap --> s1--> Test
		// SCp ---> Test ---> s2,s3
		
		// == ---> compare refrnces ---> point/refer same Object
		System.out.println(s1==s2);  // false
		System.out.println(s2==s3); // true
		
		System.out.println(s1.equals(s2)); // true ---> content 
		
		//---> trim();
		//----> split(); ---> String []
		
		
		
		
	}

}
