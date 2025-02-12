import java.util.*;

//Create a abstract class to hide functionality
 //Abstraction
abstract class BankAccount{
     //Encaosulated data-->hiding data(private variables)
    private String AccountHolderName;
    private double balance;
    
    //Constructor to initialize variables
    BankAccount(String AccountHolderName,double balance){
        this.AccountHolderName=AccountHolderName;
        this.balance=balance;
    }
    
    //Abstract method to print details
    public abstract void displayDetails();
    
    // Getter and setter methods
    //Getter
    public String getAccountHolderName(){
        return AccountHolderName;
    }
    
    //Setter
    public void setAccountHolderName(String AccountHolderName){
        this.AccountHolderName=AccountHolderName;
    }
    
    //Getter
    public double getbalance(){
        return balance;
    }
    
    //Setter
    public void setbalance(){
        this.balance=balance;
    }
    
    //Polymorphism
    // method to deposit
    public void deposit(int amount){
        if(amount>0){
            System.out.println("Deposit Amount: "+amount);
        }
        else{
            System.out.println("Invalid Amount");        
        }
    } 
    //Polymorphism
    // method to withdraw
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            System.out.println("Withdraw Amount: "+amount);
        } else{
            System.out.println("Insufficient Amount");
        }
    }
    
    // Method to show the current balance
    public void currentBalance(){
        System.out.println("Updated Balance: "+getbalance());
    }
}

// Inheritance -->using super keyword calling
class SavingsAccount extends BankAccount{
    public SavingsAccount(String AccountHolderName,double balance){
        super(AccountHolderName,balance);
    }
    
    //@Override
     //Display Details
    public void displayDetails(){
        //System.out.println("Saving Account Details:");
        System.out.println("Account Holder Name: "+getAccountHolderName());
        System.out.println("Balance: "+getbalance());
    }
}


public class Main
{
	public static void main(String[] args) {
	    // object creation for subclass 
	    BankAccount savings=new SavingsAccount("Sujitha",2000);
	    System.out.println("Saving Account Details:");
		savings.deposit(2000);
		savings.withdraw(500);
		savings.displayDetails();
		savings.currentBalance();
	}
}
