import java.util.Scanner;
public class BankAccountTransfer {
	
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
	  if (withDrawAmount>StartBal)
			 System.out.println("Sorry, sufficient funds are not available.");
	  else if(withDrawAmount<=StartBal);
		  double balance=StartBal-withDrawAmount;
	 
	 double depositAmount;
	 System.out.print("Enter the amount to be deposited: ");
	 depositAmount=in.nextDouble();
	 myBankAccount.deposit(depositAmount);
	 balance=balance+depositAmount;
	 System.out.print("Your final balance is $"+balance);
	 
 
	  
       
}
}