import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int a =s.nextInt();
	    int sum=0;
		for(int i=2;i<=a;i+=2)
		{
		     sum=sum+i;
		}
	
	System.out.print(sum);
	    
	}

}
