public class Main
{
	public static void main(String[] args) {
	    String str1="hello world";
	    String str2="HELLO WORLD";
	    
		System.out.println("Statement :" +str1.equals(str2));//false beacuse of different case letters
	}
}

*****************************************************************************************************

public class Main
{
	public static void main(String[] args) {
	    String str1="hello world";
	    String str2="HELLO WORLD";
	    
		System.out.println("Statement :" +str1.equalsIgnoreCase(str2));//true because case are ignored
	}
}
