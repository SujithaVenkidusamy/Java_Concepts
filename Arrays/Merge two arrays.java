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
