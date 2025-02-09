import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter n : ");
	    int n=s.nextInt();
	    int sq=n*n; 
	    System.out.println(" sq: " +sq);
	    int r,sum=0;
	    while(sq>0)
	    {
	        r=sq%10;    
	        sum=(sum*10)+r;    
	        sq=sq/10; 
	            
	    }
	    System.out.println(" rev :" +sum);
	    int sqrt=(int)Math.sqrt(sum);
	    System.out.println(" sqrt :" +sqrt);
	    int sum1=0;
	    while(sqrt>0)
	    {
	        r=sqrt%10;    
	        sum1=(sum1*10)+r;    
	        sqrt=sqrt/10; 
	   }
	   System.out.println(" rev :" +sum1);
	   if(sqrt==0)
	   {
	       System.out.println("Adam");
	   }
	   else
	   {
	       System.out.println("Not");
	       
	   }
	}  
}  
