import java.util.*;
public class Main
{
    public static int fibonacci(int n){
        if(n<=1){ //Base case
            return n;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2) ; //Recursive case
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    for(int i=0;i<number;i++){
		System.out.println("The fibonacci is: "+fibonacci(i));
	    }
	}
}
