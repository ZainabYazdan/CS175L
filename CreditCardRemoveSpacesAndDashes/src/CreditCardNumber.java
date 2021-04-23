import java.util.Scanner;
public class CreditCardNumber {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
		int i = 0;
		String creditCardNumber = "";
		while (!creditCardNumber.equals("-99"))
		
		{
			System.out.print("Enter a Credit Card number or -99 to end: ");
			creditCardNumber = in.nextLine();
			while (i < creditCardNumber.length() && !creditCardNumber.equals("-99"))
		  {
				char ch = creditCardNumber.charAt(i);
				if (ch == ' ' || ch == '-')
		          {
					String before = creditCardNumber.substring(0, i);
					String after = creditCardNumber.substring(i + 1);
					creditCardNumber = before + after;
		          }
				else
				  {
					i++;
				  }
		  }
			System.out.println(creditCardNumber);
			i = 0;
		}
		
		System.out.println("Goodbye!");
		
		

	}

}