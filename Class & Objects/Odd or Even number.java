import java.util.*;
public class Main
{
    int num;
    void oddeven(int num)
    {
    
        
        if(num%2==0)
        {
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
            
        }
    }
    
	public static void main(String[] args) {
		Main m=new Main();
		m.oddeven(41);
		
	}
}
