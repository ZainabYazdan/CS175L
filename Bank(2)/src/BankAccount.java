/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double InterestPct;
   private double startBal;
   private double calcinterest;
   
   /**
      Constructs a bank account with balance.
   */
  
    public BankAccount(double startBal, double InterestPct)
    {
      balance =startBal;
      double Interestrate=InterestPct;
    System.out.println("Created new account with balance "+startBal+" and interest rate "+InterestPct);
     
    }

   /**
      Makes a deposit into this account.
      @param amount the amount of the deposit
   */
   public void deposit(double depositAmount)
   {
      balance = balance + depositAmount;
      System.out.println("Deposited: $"+depositAmount);
   }

   /**
      Makes a withdrawal from this account, or charges a penalty if
      sufficient funds are not available.
      @param amount the amount of the withdrawal
   */
   public void withdraw(double withDrawAmount)
   {
	   
	 if (withDrawAmount<=balance) {
		      balance = balance - withDrawAmount;
		      System.out.println("Withdrew:"+ withDrawAmount);
		      
			   }
			   else {
				  System.err.println("Insufficient Fund to support withdrawal");
				 
				 	
				 		   }
	 }
	   
	   
	   
		  
	  

   
   
   public void calcinterest(double calcinterest, double balance, double InterestPct) {
    { calcinterest=balance*InterestPct;
   } System.out.println("Interest: "+calcinterest); 
   
	    balance=balance+calcinterest;
		  System.out.println("The account balance is: $" + balance);
   }  

   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance(double balance)
   {System.out.print("The account balance is: $");
      return balance;}
   
}
