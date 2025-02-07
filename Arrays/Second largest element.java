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
