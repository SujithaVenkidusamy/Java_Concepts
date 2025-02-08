import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int arr[]={3,1,4,5,2};
	    InsertionSort(arr);//Function call
	    System.out.print(Arrays.toString(arr));
		
	}
	public static void InsertionSort(int arr[]){
	    for(int i=0;i<arr.length-1;i++){ // Loop over each element starting from 0
	        for(int j=i+1;j>0;j--){ // Loop from j=i+1 to the beginning of the array
	            if(arr[j]<arr[j-1]){ // If the current element is smaller than the previous one
                    // Swap the elements
	                int temp=arr[j];
	                arr[j]=arr[j-1];
	                arr[j-1]=temp;
	            }
	            else{
	                break; // If no swap is needed, break the inner loop
	            }
	        }
	    }
	}
}
