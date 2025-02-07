import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    int m=1;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(" " +m);
	            m++;
	        }
	        System.out.println();
	    }
	}
}
