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
