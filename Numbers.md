### NUMBERS:
## 1. If number is odd print num+1, if is even print num-1: 
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int a=100;
		for(int i=1;i<a;i++)
		{
		    if(i%2==0){
		        System.out.println(i - 1);
		    }
	
		    else{
		        System.out.println(i + 1);
		    }
		}
	}
}
````

## 2. Print 1 to 100 except 20,50,70:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int a=100;
		for(int i=1;i<a;i++)
		{
		    if(i==20 || i==50 || i==70){
		 
		    }
	
		    else{
		        System.out.println(i);
		    }
		}
	}
}
````



