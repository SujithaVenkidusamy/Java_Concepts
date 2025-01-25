### ARRAY:
## 1. Maximum and Minimum number:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter size of array :");
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    
	    System.out.print("Enter elements :");
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    
	    System.out.print("Enter target :");
	    int target=s.nextInt();
	    boolean found=false;
	    
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            found=true;
	            break;
	        }
	    
	    }
	    System.out.println(found);
	        
}
	    
}
````

## 2. Print true if element is present in the array else false:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter size of array :");
	    int n=s.nextInt();
	    System.out.print("Enter elements :");
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    System.out.print("Enter target :");
	    int target=s.nextInt();
	    boolean found=false;
	    

	    for(int i=0;i<arr.length;i++){
	        if(arr[i]==target){
	            found=true;
	            break;
	        }
	    
	    }
	    System.out.println(found);
	        
}
	    
}
````

 ## 3.a) Print the elements of array in Ascending order:(Using built-in function)
 ````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter size of array :");
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    
	    System.out.print("Enter elements :");
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    
	    Arrays.sort(arr);
	     System.out.print("Ascending order :");
	     for(int i=0;i<arr.length;i++){
	         System.out.print(arr[i] + " ");
        }
        System.out.println();

	        
}	    
}
````

## 3.b) Print the elements of array in Ascending order:(Using for loop)
````java[]

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        // Implementing Bubble Sort to sort the array in ascending order
 	int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Print the sorted array
        System.out.println("Sorted array in ascending order:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
````

## 4. Print duplicate element in the array:
````java[]

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

    
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] ==arr[j]) {
                    System.out.println("Duplicate: "+arr[i]);
                    
                }
            }
        }

        
    }
}
````

## 5. Remove the duplicates and print also print the duplicated element:
````java[]

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[]={11,23,11,14,23,14,2,5};
        Arrays.sort(a);
        System.out.println();
        System.out.print("After removing duplicates: ");
        for(int i=0;i<a.length;i++){
            if(i==0 || a[i]!=a[i-1]){
                System.out.print(a[i]+" ");
            }
        }
        System.out.println();
        System.out.print("Duplicates: ");
        for(int i=0;i<(a.length)-1;i++){
            if(a[i]==a[i+1]){
                System.out.print(a[i]+" ");
                continue;
            }
        }
        
        
    }
}
````


## 6.a) Second largest element in the array:(Using built-in function)
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    System.out.print("Enter size of array :");
	    int n=s.nextInt();
	    int arr[]=new int[n];
	    
	    System.out.print("Enter elements :");
	    for(int i=0;i<n;i++){
	        arr[i]=s.nextInt();
	    }
	    
	    Arrays.sort(arr);
	     System.out.print("Ascending order :");
	     for(int i=0;i<arr.length;i++){
	         System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Second largest: "+arr[n-2]);   
}	    
}
````

## 6.b) Second largest element in the array:(Using for loop)
````java[]

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = s.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        
 	    int temp=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        
        System.out.print("Sorted array in ascending order: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Second largest: "+arr[n-2]);
    }
}
````
## 7. Merge two arrays:
````java[]

import java.util.*;
public class Main {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={6,7,8,9,10};
        int aa=a.length;
        int bb=b.length;
        //get the first array 
        
        System.out.print("Array 1: ");
        for(int i=0;i<aa;i++){
            System.out.print(a[i]+" ");
        }
        //get the second array 
        System.out.println();
        System.out.print("Array 2: ");
        for(int j=0;j<bb;j++){
            System.out.print(b[j]+" ");
        }
        
        int cc=aa+bb;
        int c[]=new int[cc];
        for(int i=0;i<aa;i++){
            c[i]=a[i];
        }
        for(int j=0;j<bb;j++){
            c[aa+j]=b[j];
        }
        System.out.println();
        System.out.print("Merged array :");
        for(int i=0;i<cc;i++){
            System.out.print(c[i]+" ");
        }
 
    }
}
````

## 8. 
````java[]




````













