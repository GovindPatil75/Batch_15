package Test;

public class Test_3 {

	public static void main(String[] args) {
		
		String s1="Test"; //tseT
		String rev="";
		
		System.out.println(s1.length()); // 4 
		System.out.println(s1.charAt(3)); // t
		
		for(int i=s1.length()-1;i>=0;i--) {
			
			rev=rev+s1.charAt(i); //tseT
		}
        System.out.println(rev);
	}

}
