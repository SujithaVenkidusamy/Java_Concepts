import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter number:");
	    int num=s.nextInt();
	    int rem=0;
	    int sum=0;
	    while(num>0){
	        rem=num%10;
	        sum=(sum*10)+rem;
	        num=num/10;
	        
	    }
	    
	    System.out.print(sum);

	}
}
