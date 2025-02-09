import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int fact=1;
	    int a =s.nextInt();
		for(int i=1;i<=a;i++)
		{
		   
		        fact=fact*i;
		        
		}
		System.out.print(fact);
	}
}
