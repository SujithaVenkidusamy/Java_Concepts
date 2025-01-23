### PATTERN PROGRAMS:

## 1. Square:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
````

## 2. Rectangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    System.out.print("Enter m:");
	    int m=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=m;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
````

## 3. Hallow Square:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=n;j++){
	            if(i==1 || i==n ||j==1 ||j==n){
	                System.out.print("* ");
	            }
	            else{
	                System.out.print("  ");
	            }
	            
	        }
	        System.out.println();
	    }
	}
}
````

## 4. Right angled triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
````

## 5. Inverted right angled triangle :
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=n;i>=1;i--){
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
````



## 6. Mirror right angled triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
   }

}
````

## 7. Inverted  mirror right angled triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=n;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
   }

}
````

## 8. Left arrow triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    for(int i=n-1;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
   }

}
````

## 9. Right arrow triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    for(int i=n-1;i>=1;i--){
	        for(int j=1;j<=i;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	}
}
````

## 10. Triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=(2*i)-1;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
   }

}
````

## 11. Inverted triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=n;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=(2*i)-1;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
	    
   }

}
````

## 12. Diamond:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=(2*i)-1;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    for(int i=n-1;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=(2*i)-1;j++){
	            System.out.print("* ");
	        }
	        System.out.println();
	    }
	    
   }

}
````

## 13. Hallow triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=(2*i)-1;j++){
	            if(i==1||i==n||j==1||j==(2*i)-1){
	                System.out.print("* ");
	            }
	            else{
	                System.out.print("  ");
	            }
	            
	        }
	        System.out.println();
	    }
	    
   }

}
````

## 14. Hallow diamond:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    for(int i=1;i<=n;i++){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=(2*i)-1;j++){
	            if(j==1||j==(2*i)-1){
	                System.out.print("* ");
	            }
	            else{
	                System.out.print("  ");
	            }
	            
	        }
	        System.out.println();
	    }
	    for(int i=n-1;i>=1;i--){
	        for(int sp=1;sp<=n-i;sp++){
	            System.out.print("  ");
	        }
	        
	        for(int j=1;j<=(2*i)-1;j++){
	            if(j==1||j==(2*i)-1){
	                System.out.print("* ");
	            }
	            else{
	                System.out.print("  ");
	            }
	            
	        }
	        System.out.println();
	    }
	    
   }

}
````

## 15. Floyd triangle:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter n:");
	    int n=s.nextInt();
	    int m=1;
	    for(int i=1;i<=n;i++){
	        for(int j=1;j<=i;j++){
	            System.out.print(" " +m);
	            m++;
	        }
	        System.out.println();
	    }
	}
}
````
