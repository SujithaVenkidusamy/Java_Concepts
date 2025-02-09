import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int r,sum=0; 
	    int temp=n;    
	    while(n>0){    
	        r=n%10;  
	        int fact=1;
	        for(int i=1;i<=r;i++)
	        {
	            fact=fact*i;
	        }
	        sum=sum+fact;    
	        n=n/10;    
	    }    
	    if(sum==temp){    
	    System.out.println("Strong number ");
	    }
	    else{    
	    System.out.println("not strong");    
	    }
	}  
} 
