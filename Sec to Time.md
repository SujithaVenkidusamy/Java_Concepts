## Time(Hour, Minute, Seconds):
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter Seconds:");
	   int d=s.nextInt();
	   int hour=d/3600;
	   int remain=d%3600;
	   int min=remain/60;
	   int sec=remain%60;
	   System.out.println("Hour:"+hour);
	   System.out.println("Min:"+min);
	   System.out.println("Sec:"+sec);
	} 
}
````

## Time with Day (Day, Hour, Minute, Seconds):
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter Seconds:");
	   long d=s.nextInt();
	   long days=d/(24*3600);
	   long hour=d/3600;
	   long remain=d%3600;
	   long min=remain/60;
	   long sec=remain%60;
	   System.out.println("Hour:"+hour);
	   System.out.println("Min:"+min);
	   System.out.println("Sec:"+sec);
	} 
}
````

