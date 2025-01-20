import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter days:");
	   int d=s.nextInt();
	   int year=d/365;
	   int remain=d%365;
	   int weeks=remain/7;
	   int days=remain%7;
	   System.out.println("Years:"+year);
	   System.out.println("Weeks:"+weeks);
	   System.out.println("Days:"+days);
	} 
}
