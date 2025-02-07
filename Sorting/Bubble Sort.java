import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={3,1,4,5,2};
	    BubbleSort(arr);//Function call
		
	}
	public static void BubbleSort(int arr[]){
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length-1-i;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    System.out.print(Arrays.toString(arr));//Default function
	}
}

*****************************************************************************************************************

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={3,1,4,5,2};
	    BubbleSort(arr);
		
	}
	public static void BubbleSort(int arr[]){
	    for(int i=0;i<arr.length;i++){
	        for(int j=0;j<arr.length-1-i;j++){
	            if(arr[j]>arr[j+1]){
	                int temp=arr[j];
	                arr[j]=arr[j+1];
	                arr[j+1]=temp;
	            }
	        }
	    }
	    
	     // Using a loop to print the sorted array
	    for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");  // Adds commas between elements
            }
	    }  
	    
	     // Using a loop to print the sorted array(for each loop)
	    //for (int num : arr) {
            //System.out.print(num+" " );

		
	}
}

