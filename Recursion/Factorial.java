import java.util.*;
public class Main
{
    public static int factorial(int n){
        if(n==0 || n<0){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
		System.out.print("The factorial is: "+factorial(number));
	}
}
