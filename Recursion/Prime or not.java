import java.util.*;
public class Main
{
    public static boolean prime(int n,int i){
        if(n<=1){ //Base case
            return false;
        }
        if(i==1){
            return true;
        } 
        if(n%i==0){
            return false;
        } 
        return prime(n,i-1);
       
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    boolean result=prime(number,number/2);
	    if(result) System.out.print("Prime number");
		else System.out.print("Not a Prime number");
	    
	}
}
