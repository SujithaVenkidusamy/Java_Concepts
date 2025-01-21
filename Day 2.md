Even Numbers:
```java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int a =s.nextInt();
		for(int i=1;i<a;i++)
		{
		    if(i%2==0){
		        System.out.print(i +" ");
		    }
		}
		
	}
}
```

Even & Odd numbers:
```java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int a =s.nextInt();
		for(int i=1;i<a;i++)
		{
		    if(i%2==0){
		        System.out.print(i +" ");
		    }
		}
		System.out.println();
		for(int i=1;i<a;i++)
		{
		    if(i%2!=0){
		        System.out.print(i + " ");
		    }
		}
	}
}
```


Factorial:
```java[]

 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int fact=1;
	    int a =s.nextInt();
		for(int i=1;i<=a;i++)
		{
		   
		        fact=fact*i;
		        
		}
		System.out.print(fact);
	}
}
````


Multiplication Table:
```java[]


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int a =s.nextInt();
		for(int i=1;i<=a;i++)
		{
		    System.out.println(a +"x" +i + "=" +i*a);
		        
		}
		
	}
}
````


Fibonacci Series:
```java[]


 import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int a =0;
	    int b=1;
	    int count=10;
	    System.out.print(a + " "  +b);
	    for(int i=2;i<count;i++)
	    {
	        int c=a+b;
	        a=b;
	        b=c;
	        System.out.print(" " +c);
	    }	
	}
}
````


Reverse a Number:
```java[]


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter value of n:");
	    int n=s.nextInt();
	    StringBuffer sb = new StringBuffer(String.valueOf(n));
	    sb.reverse();
	    n=Integer.parseInt(String.valueOf(sb));
	    System.out.print(n);
	  
	}
}
````


Number of Digits:
```java[]


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
````


Add Even Numbers:
```java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s =new Scanner(System.in);
	    int a =s.nextInt();
	    int sum=0;
		for(int i=2;i<=a;i+=2)
		{
		     sum=sum+i;
		}
	
	System.out.print(sum);
	    
	}

}
````


Palindrome:
```java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int r,sum=0,temp;    
	    int n=s.nextInt();  
	    temp=n;    
	    while(n>0){    
	        r=n%10;    
	        sum=(sum*10)+r;    
	        n=n/10;    
	    }    
	    if(temp==sum)    
	    System.out.println("palindrome number ");    
	    else    
	    System.out.println("not palindrome");    
	    
	}  
}
````


Strong Number:
```java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int r,sum=0; 
	    int temp=n;    
	    while(n>0){    
	        r=n%10;  
	        int fact=1;
	        for(int i=1;i<=r;i++)
	        {
	            fact=fact*i;
	        }
	        sum=sum+fact;    
	        n=n/10;    
	    }    
	    if(sum==temp){    
	    System.out.println("Strong number ");
	    }
	    else{    
	    System.out.println("not strong");    
	    }
	}  
}  
````


Automorphic Number:
```java[]


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter n : ");
	    int n=s.nextInt();
	    int sq=n*n; 
	    while(n>0)
	    {
	        if(n%10 != sq%10)
	        {
	            System.out.println("Not automorphic");
	            break;
	        }
	    n=n/10;
	    sq=sq/10;
	        
	    }
	        
	    if(n==0){    
	    System.out.println("automorphic");
	            
	    }
	    
	}  
}
````


Adam Number:
```java[]


import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter n : ");
	    int n=s.nextInt();
	    int sq=n*n; 
	    System.out.println(" sq: " +sq);
	    int r,sum=0;
	    while(sq>0)
	    {
	        r=sq%10;    
	        sum=(sum*10)+r;    
	        sq=sq/10; 
	            
	    }
	    System.out.println(" rev :" +sum);
	    int sqrt=(int)Math.sqrt(sum);
	    System.out.println(" sqrt :" +sqrt);
	    int sum1=0;
	    while(sqrt>0)
	    {
	        r=sqrt%10;    
	        sum1=(sum1*10)+r;    
	        sqrt=sqrt/10; 
	   }
	   System.out.println(" rev :" +sum1);
	   if(sqrt==0)
	   {
	       System.out.println("Adam");
	   }
	   else
	   {
	       System.out.println("Not");
	       
	   }
	}  
}  
````


Friendly Pair:
```java[]











