public class Main
{
	public static void main(String[] args) {
	    String str="Sujitha";
	    char ch='a';
	    int count=0;
	    for(int i=0;i<str.length();i++){
	        if(str.charAt(i)==ch){
	            count++;
	        }
	    }
	    System.out.println("Occurance of a character in String : " +count); 
	}
}
