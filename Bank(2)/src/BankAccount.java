/**
   A bank account has a balance and a mechanism for
   applying interest or fees at the end of the month.
*/
public class BankAccount
{
   private double balance;
   private double Interestrate;
   
   
   /**
      Constructs a bank account with balance.
   */
  
    public BankAccount(double startBal, double InterestPct)
    {
      balance =startBal;
    Interestrate= InterestPct;
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
	   
	   
	   
		  
	  

   
   
   public void calcinterest() {
   double interest=balance*Interestrate;
   System.out.println("Interest: "+interest); 
   
	    balance=balance+interest;
		  System.out.println("The account balance is: $" + balance);
   }  

   /**
      Gets the current balance of this bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;}
   
}