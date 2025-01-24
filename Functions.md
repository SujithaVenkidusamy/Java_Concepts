### FUNCTIONS:

## 1. Assignment Operators:(Add,Sub,Mul,Div)
````java[]

import java.util.*;
public class Main
{
  
    static void Add(int n1, int n2){
        System.out.print("The sum= ");
        int sum=n1+n2;
        System.out.println(sum);
    }
    
    static void Sub(int n1, int n2){
        System.out.print("The Diff= ");
        int sub=n1-n2;
       System.out.println(sub);
    }
    
    static void Mul(int n1, int n2){
        System.out.print("The Product= ");
        int mul=n1*n2;
        System.out.println(mul);
    }
     static void Div(int n1, int n2){
        System.out.print("The Quotient= ");
        int div=n1/n2;
        System.out.println(div);
     }
    
    
    static void User(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter n1: ");
        int n1=s.nextInt();
         System.out.print("Enter n2: ");
        int n2=s.nextInt();
  	    //Function call
        Add(n1,n2);
        Sub(n1,n2);
        Mul(n1,n2);
        Div(n1,n2);
    }
    static void Display(){
        // Calling user function
        User();
    }
    public static void main(String[] args) {
      // Calling display function to print output 
	    Display();
	   
	    
		
	}
}
````

## 2. Area of Triangle:
````java[]

import java.util.*;
class Triangle{
    private static int b,h;
    public static void Area(int x,int y){
        b=x;
        h=y;
        
    }
    public static int Cal(){
        int c=b*h;
        int d=c/2;
       return d;
        
    }
    
}

public class Main
{
  
    public static void main(String[] args) {
       
       
       Scanner s=new Scanner(System.in);
        System.out.print("Enter breadth:");
        int x=s.nextInt();
        System.out.print("Enter height:");
        int y=s.nextInt();
        Triangle.Area(x,y);
        Triangle.Cal();
        int result=Triangle.Cal();
        System.out.println("Area of Triangle :"+result);
        
       
       
        
    
		
	}
}	
````
