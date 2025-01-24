### ARRAY:
## 1. Maximum and Minimum number:
````java[]

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,11,22,3,2,5,6,10,8};
	    int max=arr[0];
	    int min=arr[0];
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>max){
	            max=arr[i];
	   
	        }
	        if(arr[i]<min){
	            min=arr[i];
	        }
	        
	    }
	    System.out.println("Maximum:"+max);
	    System.out.println("Minimum:"+min);
	    
	}
}
````



