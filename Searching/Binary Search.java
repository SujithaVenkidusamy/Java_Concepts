import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {100,200,300,400,500};
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        
        int start = 0;
        int end = arr.length-1;
        int flag=0;
        while(start<=end){
            int mid =(start+end)/2;
            if(arr[mid]==target){
                System.out.println("Element Found at index: " + mid);
                flag=1; 
                break;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if(flag==0){
        System.out.println("Element not found");
    }
    }
}
