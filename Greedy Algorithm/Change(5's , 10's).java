import java.util.*;
public class Main {
    public static boolean change(int arr[]) {
        int c1 = 0; //5's
        int c2 = 0; //10's
        for (int bill : arr) {
            if (bill == 5) {
                c1++;
            } else if (bill == 10) {
                if (c1 == 0) return false;
                c1--;
                c2++;
            } else if (bill == 20) {
                if (c2 > 0 && c1 > 0) {
                    c2--;
                    c1--;
                } else if (c1 >= 3) {
                    c1 -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int arr[] = {5, 5, 5, 10, 20}; 
        boolean result = change(arr);
        System.out.println(result); 
    }
}
