import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the input : ");
	    char ch=s.next().charAt(0);
		
		if((ch>='a'&& ch<='z') || (ch>='A'&& ch<='Z')){
		    System.out.println("Alphabet");
		    if((ch =='a'||ch =='e'||ch =='i'||ch =='o'||ch =='u')||(ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U')){
		         System.out.println("It is a vowel");
		        
		    }
		    else{
		        System.out.println("It is not a vowel");
		        
		    }
		    
		}
		else if(Character.isDigit(ch)){
		    System.out.println("Number");
		}
		else{
		    System.out.println("Symbol");
		}
		
		
		
	}
}
