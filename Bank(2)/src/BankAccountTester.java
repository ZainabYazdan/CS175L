import java.util.Scanner;
public class BankAccountTester {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		double startBal;
		double InterestPct;
		double balance=0;
		double depositAmount;
		double withDrawAmount;
		String response;
		double calcinterest=0;
		
		System.out.print("Please enter the amount to start the account: ");
		startBal=in.nextDouble();
		System.out.print("Please enter the interest rate for this account: ");
		InterestPct=in.nextDouble();
		BankAccount myBankAccount=new BankAccount(startBal, InterestPct);
		
		
		 
		 System.out.print("Enter amount to deposit in the account: ");
		 depositAmount=in.nextDouble();
		 balance=startBal+depositAmount;
		 myBankAccount.deposit(depositAmount);
		 
		 
		 System.out.print("Please enter amount to withdraw from this account: ");
		 withDrawAmount=in.nextDouble();
		 myBankAccount.withdraw(withDrawAmount);
		  if (withDrawAmount>balance)
			 System.out.print("Please enter amount to withdraw from this account: ");
		 withDrawAmount=in.nextDouble();
		     balance=balance-withDrawAmount;
		     myBankAccount.withdraw(withDrawAmount);
		     
		      {System.out.print("If you want me to generate Interest, enter 'Yes': ");
		  response=in.next();
		     if (response.equals("Yes")) {
		  			  myBankAccount.calcinterest();
		     } 
		     else 
		    	 System.out.print(myBankAccount.getBalance());
			 return;}
			  
	}
}