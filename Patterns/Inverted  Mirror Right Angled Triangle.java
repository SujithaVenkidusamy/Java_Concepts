import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=n;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
   }

}
