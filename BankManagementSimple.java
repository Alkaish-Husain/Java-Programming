package BankManagementSystem;
import java.util.Scanner; 

class NegativeAmountException extends Exception { 
    public NegativeAmountException(String message) { 
        super(message); 
    } 
} 
 
class MinimumBalanceException extends Exception { 
    public MinimumBalanceException(String message) { 
        super(message); 
    } 
} 
 
interface Printable { 
    void printDetails(); 
} 
 
abstract class BankAccount implements Printable { 
    protected String accountHolder; 
    protected String accountNumber; 
    protected double balance; 
 
    public final void deposit(double amount) throws 
NegativeAmountException { 
        if (amount < 0) { 
            throw new NegativeAmountException("Deposit amount cannot "
            		+ "be negative!"); 
        } 
        balance += amount; 
        System.out.println("Deposited:- " + amount); 
    } 
 
    public final void withdraw(double amount) throws 
NegativeAmountException, MinimumBalanceException { 
        if (amount < 0) { 
            throw new NegativeAmountException("Withdrawal "+
"amount cannot be negative!"); 
        } 
        if (balance - amount < 0) { 
            throw new MinimumBalanceException("Insufficient "
            		+ "balance!"); 
        } 
        balance -= amount; 
        System.out.println("Withdrawn:- " + amount); 
    } 
 
    public BankAccount(String accountHolder, String 
accountNumber, double balance) { 
        this.accountHolder = accountHolder; 
        this.accountNumber = accountNumber; 
        this.balance = balance; 
    } 
 
    public abstract double calculateInterest(); 
} 
 
class SavingsAccount extends BankAccount { 
    private double interestRate = 0.04; //
 
    public SavingsAccount(String accountHolder, String 
accountNumber, double balance) { 
        super(accountHolder, accountNumber, balance); 
    } 
 

    public double calculateInterest() { 
        return balance * interestRate; 
    } 
 
    public void printDetails() { 
        System.out.println("Savings Account - Holder:- " + 
accountHolder +  ", Number:- " + accountNumber +  ", Balance:- " + balance); 
    } 
} 
 
class CurrentAccount extends BankAccount { 
    private double interestRate = 0.02; 
 
    public CurrentAccount(String accountHolder, String 
accountNumber, double balance) { 
        super(accountHolder, accountNumber, balance); 
    } 
 
   
    public double calculateInterest() { 
        return balance * interestRate; 
    } 
 
    
    public void printDetails() { 
        System.out.println("Current Account - Holder:- " + 
    accountHolder +", Number:- " + accountNumber + ", Balance:- " + balance); 
    } 
}

public class BankManagementSimple {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in); 
	        BankAccount account = null; 
	 
	        try { 
	            System.out.print("Enter Account Holder Name:- "); 
	            String name = sc.nextLine(); 
	 
	            System.out.print("Enter Account Number:- "); 
	            String number = sc.nextLine(); 
	 
	            System.out.print("Enter Initial Balance:- "); 
	            double balance = sc.nextDouble(); 
	 
	            System.out.println("Choose Account Type: 1. Savings  2. Current");
	            System.out.print("Enter your choice:- ");
	            int choice = sc.nextInt(); 
	 
	            if (choice == 1) { 
	                account = new SavingsAccount(name, number, 
	balance); 
	            } else if (choice == 2) { 
	                account = new CurrentAccount(name, number, 
	balance); 
	            } else { 
	                System.out.println("Invalid choice!"); 
	                return; 
	            } 
	 
	            int option; 
	            do { 
		                System.out.println("\n--- Bank Menu ---"); 
		                System.out.println("1. Deposit"); 
		                System.out.println("2. Withdraw"); 
		                System.out.println("3. Check Balance"); 
		                System.out.println("4. Calculate Interest"); 
		                System.out.println("5. Print Account Details"); 
		                System.out.println("6. Exit"); 
		                System.out.print("Enter your choice:- "); 
		                option = sc.nextInt(); 
		 
		                try { 
		                    switch (option) { 
		                        case 1: 
		                            System.out.print("Enter amount to deposit:- "); 
		                            double depositAmt = sc.nextDouble(); 
		                            account.deposit(depositAmt); 
		                            break; 
		 
		                        case 2: 
		                            System.out.print("Enter amount to withdraw:- "); 
		                            double withdrawAmt = sc.nextDouble(); 
		                            account.withdraw(withdrawAmt); 
		                            break; 
		 
		                        case 3: 
		                            System.out.println("Current Balance:- " + account.balance); 
		                            break; 
		 
		                        case 4: 
		                            System.out.println("Interest Earned:- " + account.calculateInterest()); 
		                            break; 
		 
		                        case 5: 
		                            account.printDetails(); 
		                            break; 
		 
		                        case 6: 
		                            
		System.out.println("Exiting...!"); 
		                            break; 
		 
		                        default: 
		                            System.out.println("Invalid option. Try again!"); 
		                    } 
		                } catch (NegativeAmountException | MinimumBalanceException e) { 
		                    System.out.println("Error:- " + e.getMessage()); 
		                } 
		 
		            } while (option != 6); 
		 
		        } catch (Exception e) { 
		System.out.println("Unexpected Error:- " + e.getMessage()); 
		} finally { 
		System.out.println("Bank Management System!"); 
		sc.close(); 
		} 
		} 
		
	
		}


