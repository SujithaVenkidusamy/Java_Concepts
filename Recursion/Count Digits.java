import java.util.*;
public class Main {

    // function to count digits
    static int countDigit(int n) {
        // Base case
        if (n == 0)
            return 1;

        int count = 0;
      
        // Iterate till n has digits remaining
        while (n != 0) {
          
            // Remove rightmost digit
            n = n / 10;
          
            // Increment digit count by 1
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 418100;
        System.out.println( countDigit(n));
    }
}
