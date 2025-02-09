import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n=sc.nextInt();
		int originalnum=n;
		int temp=n,t=n;
		int count=0;
		while(temp>0){
		    temp=temp/10;
		    count ++;
		}
		int rem;
		int armstrong=0;
		while(t>0){
		    rem=t%10;
		    armstrong+=Math.pow(rem,count);
		    t/=10;
		}
		if(armstrong==originalnum){
		    System.out.print("Armstrong number");
		}
		else{
		    System.out.print("Not an Armstrong number");
		}
		
	}
}
