import java.util.Scanner;
public class BankThreshold {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		double startBal;
		double InterestPct;
		
		
		System.out.print("Please enter the amount to start the account: ");
		startBal=in.nextDouble();
		System.out.print("Please enter the interest rate for this account: ");
		InterestPct=in.nextDouble();
		BankAccount myBankAccount=new BankAccount(startBal, InterestPct);
		System.out.println("Enter the threshold for your account and enter 'End' to stop");
		while (in.hasNextDouble())
		{int months = 0;
			double threshold = in.nextDouble();
			
			while (myBankAccount.getBalance() < threshold)
			{myBankAccount.calcinterest();
				months++;
			}
			System.out.println("It will take "+months+" months to reach the threshold: "+threshold);
			System.out.println("Enter the threshold for your account and enter 'End' to stop");
			
		}
		
	
	System.out.print("Goodbye!");
	
	}
}
