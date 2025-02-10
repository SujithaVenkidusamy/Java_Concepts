import java.util.*;

public class Main {
  public static void main(String[] args) {
    int n = 10;
    printer(n);
  }

  public static void printer(int n) {
    if (n == 0) return;

    System.out.print(n + " ");
    printer(n - 1);
    
  }
}
