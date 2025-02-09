import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a =0;
	    int b=1;
	    int count=10;
	    System.out.print(a + " "  +b);
	    for(int i=2;i<count;i++)
	    {
	        int c=a+b;
	        a=b;
	        b=c;
	        System.out.print(" " +c);
	    }	
	}
}
