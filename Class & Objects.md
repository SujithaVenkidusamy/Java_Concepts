### CLASS & OBJECTS:
## 1. Create a class with attribute and print them:
````java[]

import java.util.*;
public class Main
{
    String name;
    int age;
    
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    String name=s.nextLine();
	    int age=s.nextInt();
		System.out.println("Name is:"+name);
		System.out.println("Age is:"+age);
	}
}
````

## 2. Odd/Even number:
````java[]

import java.util.*;
public class Main
{
    int num;
    void oddeven(int num)
    {
    
        
        if(num%2==0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
            
        }
    }
    
	public static void main(String[] args) {
		Main m=new Main();
		m.oddeven(41);
		
	}
}
````

## 3. Simple interest calculation:(using void method)
````java[]

import java.util.*;
public class Main
{
    double p;
    double n;
    double r;
   
    void simpleinterest(double p,double n,double r )
    {
        double SI=(p*n*r)/100;
        System.out.println("Simple interest is:" +SI);
        
 
    }
    
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter the principal amount:");
	    double p=s.nextDouble();
	    System.out.print("Enter the time(in years):");
	    double n=s.nextDouble();
	    System.out.print("Enter the rate of interest:");
	    double r=s.nextDouble();
		Main m=new Main();
		m.simpleinterest(p,n,r);
		
	}
}

````

## 4. ~ (Negation):
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int num=s.nextInt();
	    System.out.print(~num);

	}
}
````

## 5. Reverse a number:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter number:");
	    int num=s.nextInt();
	    int rem=0;
	    int sum=0;
	    while(num>0){
	        rem=num%10;
	        sum=(sum*10)+rem;
	        num=num/10;
	        
	    }
	    
	    System.out.print(sum);

	}
}
````

## 6. Class & Constructor:
````java[]

import java.util.*;
public class Person
{
    String name;
    int age;
    
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    void display()
    {
        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
    }
    public static void main(String [] args){
       
        Scanner s=new Scanner(System.in);
        String name=s.nextLine();
        int age=s.nextInt();
        Person p=new Person(name,age);
        p.display();
    }
}
````

## 7. Rectangle :
````java[]

import java.util.*;
public class Rectangle
{
    int area(int l,int w)
    {
        int area=l*w;
        return area;
    }
    
    int peri(int l,int w)
    {
        int peri=2*(l+w);
        return peri;
    }
    
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter length: ");
        int l=s.nextInt();
        System.out.print("Enter width: ");
        int w=s.nextInt();
        Rectangle r=new Rectangle();
        int area=r.area(l,w);
        int peri=r.peri(l,w);
        System.out.println("Area is : " +area);
        System.out.println("Perimeter is : " +peri);
    }
}
````


