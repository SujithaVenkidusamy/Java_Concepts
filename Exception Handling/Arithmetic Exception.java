public class Main {
    public static void main(String[] args) {
        int n=21;
        int  m=0;
        try {
            int result=n/m;
            System.out.print("Result "+result);
            
        }
        catch(ArithmeticException e) {
            System.out.print("Zero division error");

        }

    }

}
