import java.util.Scanner;

public class Main{
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
    
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        int[] tree = new int[4*n];
        build(arr, tree, 0, 0, n-1);
        
        while(true){
            System.out.println("\nChoose an option: ");
            System.out.println("1. Query max in range [l, r]");
            System.out.println("2. Update index to new value");
            System.out.println("3. Exit");
            int choice = sc.nextInt();
            
            if(choice == 1){
                System.out.print("Enter range l and r (0-based): ");
                int l = sc.nextInt(), r = sc.nextInt();
                int answer = query(tree, 0, 0, n-1, l, r);
                System.out.println("Max in range [" + l + ", " + r + "] is: " + answer);
            }
            else if(choice == 2){
                System.out.print("Enter index to update: ");
                int idx = sc.nextInt();
                System.out.print("Enter new value: ");
                int val = sc.nextInt();
                update(arr, tree, 0, 0, n-1, idx, val);
                System.out.println("Value Updarted.");
            }
            else if( choice == 3){
                break;
            }
             else{
                 System.out.println("Invalid Choice.");
             }
        }
    }
    
    static void build(int[] arr, int[] tree, int node, int start, int end){
        if(start == end){
            tree[node] = arr[start];
        } else{
            int mid = (start + end) / 2;
            build(arr, tree, 2*node+1, start, mid);
            build(arr, tree, 2*node+2, mid+1, end);
            tree[node] = Math.max(tree[2*node+1], tree[2*node+2]);
        }
    }
    
    static int query(int[] tree, int node, int start, int end, int l, int r){
        if(r < start || end < l) return Integer.MIN_VALUE;
        if(l <= start && end <= r) return tree[node];
        int mid = (start + end) / 2;
        int left = query(tree, 2*node+1, start, mid, l, r);
        int right = query(tree, 2*node+2, mid+1, end, l, r);
        return Math.max(left, right);
    }
    
    static void update(int[] arr, int[] tree, int node, int start, int end, int idx, int val){
        if(start == end){
            arr[idx] = val;
            tree[node] = val;
        } else{
            int mid = (start + end) / 2;
            if(idx <= mid) update(arr, tree, 2*node+1, start, mid, idx, val);
            else update(arr, tree, 2*node+2, mid+1, end, idx, val);
            tree[node] = Math.max(tree[2*node+1], tree[2*node+2]);
        }
    }
    
    
}
