import java.util.*;
public class Main
{
    double p;
    double n;
    double r;
   
    void simpleinterest(double p,double n,double r )
    {
        double SI=(p*n*r)/100;
        System.out.println("Simple interest is:" +SI);
        
 
    }
    
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the principal amount:");
	    double p=s.nextDouble();
	    System.out.print("Enter the time(in years):");
	    double n=s.nextDouble();
	    System.out.print("Enter the rate of interest:");
	    double r=s.nextDouble();
	    Main m=new Main();
	    m.simpleinterest(p,n,r);
		
	}
}
