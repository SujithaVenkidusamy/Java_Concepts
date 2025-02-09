import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter value of n:");
	    int n=s.nextInt();
	    StringBuffer sb = new StringBuffer(String.valueOf(n));
	    sb.reverse();
	    n=Integer.parseInt(String.valueOf(sb));
	    System.out.print(n);
	  
	}
}
