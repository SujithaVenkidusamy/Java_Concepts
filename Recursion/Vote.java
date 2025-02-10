public class Main {
	public static void main(String[] args) {
		int age=10; 
		
		try {
			if(age>=18) {
			System.out.print("Eligilbe for vote");
		    }
			else {
				System.out.print("Not Eligilbe for vote");
			}
		}
		catch(Exception e) {
			System.out.print("Error Occurred");
		}
		
	}

}
