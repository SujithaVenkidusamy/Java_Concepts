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
