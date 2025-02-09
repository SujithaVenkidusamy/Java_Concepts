import java.util.*;
class Triangle{
    private static int b,h;
    public static void Area(int x,int y){
        b=x;
        h=y;
        
    }
    public static int Cal(){
        int c=b*h;
        int d=c/2;
       return d;
        
    }
    
}

public class Main
{
  
    public static void main(String[] args) {
       
       
       Scanner s=new Scanner(System.in);
        System.out.print("Enter breadth:");
        int x=s.nextInt();
        System.out.print("Enter height:");
        int y=s.nextInt();
        Triangle.Area(x,y);
        Triangle.Cal();
        int result=Triangle.Cal();
        System.out.println("Area of Triangle :"+result);
        
	
	}
}
