import java.util.*;
public class Main {
    
    static void func(int i, int n){
        
            // Base case
            if(i>n) return;
            System.out.print(i+" ");

            // Function call (Recursive case)
            func(i+1,n);

    }
    public static void main(String[] args) {
       int n = 10;
       func(1,n);
    }
}
