import java.util.*;
public class Main
{
    public static int recsum(int n){
        if(n<=1){ //Base case
            return n;
        }
        else{
            return n+recsum(n-1); //Recursive case
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
		System.out.println("Sum of n Natural numbers: "+recsum(number));
	    
	}
}
