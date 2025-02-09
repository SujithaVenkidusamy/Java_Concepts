import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int r,sum=0,temp;    
	    int n=s.nextInt();  
	    temp=n;    
	    while(n>0){    
	        r=n%10;    
	        sum=(sum*10)+r;    
	        n=n/10;    
	    }    
	    if(temp==sum)    
	    System.out.println("palindrome number ");    
	    else    
	    System.out.println("not palindrome");    
	    
	}  
}
