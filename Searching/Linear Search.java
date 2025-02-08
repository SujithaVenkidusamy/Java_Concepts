import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = {500,600,700,800,900};
        System.out.print("Enter the target element: ");
        int target= sc.nextInt();
        
        int start = 0;
        int end = arr.length-1;
        int flag=0;
        
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]==target){
                System.out.print("Element Found at index: " + i);
                flag=1;
            }
        }
        if(flag==0){
        System.out.println("Element not found");
    }
    }
}
