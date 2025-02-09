import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter n : ");
	    int n=s.nextInt();
	    int sq=n*n; 
	    while(n>0)
	    {
	        if(n%10 != sq%10)
	        {
	            System.out.println("Not automorphic");
	            break;
	        }
	    n=n/10;
	    sq=sq/10;
	        
	    }
	        
	    if(n==0){    
	    System.out.println("automorphic");
	            
	    }
	    
	}  
}
