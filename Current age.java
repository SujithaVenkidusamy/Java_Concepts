import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
	   System.out.println("Birth year:"+a);
	   int b=s.nextInt();
	   System.out.println("Current year:"+b);
	   int c=(100-a)+b;
	   int d=b-a;
	   if(a>b){
	       System.out.println(c);
	   }
	   else{
	        System.out.println(d);
	   }
	} 
}
