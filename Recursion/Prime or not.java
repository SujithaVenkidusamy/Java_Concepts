import java.util.*;

public class Main {
    
    // checks if a number 'n' is prime, using recursion with an iterator 'i'
    public static boolean prime(int n, int i) {
        if (n <= 1) { // Base case: numbers less than or equal to 1 are not prime
            return false;
        }
        if (i == 1) { // Base case: when the iterator reaches 1, the number is prime
            return true;
        }
        if (n % i == 0) { // If the number is divisible by 'i', it's not prime
            return false;
        }
        return prime(n, i - 1); // Recursive call with 'i' reduced by 1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int number = sc.nextInt(); 
        boolean result = prime(number, number / 2); // Call the 'prime' method, starting with half of the number as the iterator
        if (result) 
            System.out.print("Prime number");
        else 
            System.out.print("Not a Prime number");
    }
}
