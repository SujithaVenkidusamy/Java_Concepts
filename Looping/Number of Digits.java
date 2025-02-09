import java.util.*;
public class Main
{
	public static void main(String[] args) {
	      int count = 0;
	      Scanner s=new Scanner(System.in);
	      System.out.print("Enter number : " );
	      int  n=s.nextInt();
	      while (n != 0) {
	          // num = num/10
	          n/= 10;
	          ++count;
    }

    System.out.println("Number of digits: " + count);
  }
}
