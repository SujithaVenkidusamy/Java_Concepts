import java.util.*;
public class Main{
    public static int rev(int n, int temp){
        // Base case
        if (n == 0){
            return temp;
	    }	
	    temp = (temp * 10) + (n % 10);
	    return rev(n / 10, temp); //Recursive case
    }
    public static void main (String[] args) {
        int n = 121;
	    int temp = rev(n, 0);
	
	    if (temp == n) System.out.println("Palindrome");
	    else System.out.println("Not a Palindrome" );
    }
}
