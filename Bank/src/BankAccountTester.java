import java.util.Scanner;
public class BankAccountTester {
	
	public static void main(String[] args) {
	
	 Scanner in= new Scanner(System.in);
	 
	 double StartBal;
	 System.out.print("Please enter the starting balance: ");
	 StartBal=in.nextDouble();
	 BankAccount myBankAccount= new BankAccount(StartBal);
	 
	 double withDrawAmount;
	 System.out.print("Please enter the amount you want to withdraw: ");
	 withDrawAmount=in.nextDouble();
	  myBankAccount.withdraw(withDrawAmount);
      double balance=StartBal-withDrawAmount;
	 
	 double depositAmount;
	 System.out.print("Enter the amount to be deposited: ");
	 depositAmount=in.nextDouble();
	 myBankAccount.deposit(depositAmount);
	 
	 balance=balance+depositAmount;
	 myBankAccount.getBalance();
	 System.out.print("Your final balance is $"+balance);
	 
 
	  
       
}
}