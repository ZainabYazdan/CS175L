package mailMerge;
import java.util.Scanner;
public class mailMerge {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String text1= "Dear <firstName> <lastName>,";
		System.out.print("Please enter your first name: ");
		String firstname=sc.nextLine();
		text1=text1.replaceFirst("<firstName>", firstname);
		
		System.out.print("Please enter your last name: ");
		String lastname=sc.nextLine();
		text1=text1.replaceFirst("<lastName>", lastname);
		
		String text2= "Please confirm that your address is <houseNumber> <street>.";
		System.out.print("Please enter your house number: ");
		String houseNumber=sc.nextLine();
		text2=text2.replaceFirst("<houseNumber>",houseNumber);
		
		System.out.print("Please enter your street: ");
		String street=sc.nextLine();
		text2=text2.replaceFirst("<street>", street);
		
		System.out.println(text1);
		System.out.println(text2);
		
		
		String text3= ("Your answer is: <yORn> Goodbye!");
		System.out.print("Is this address corect? ");
		String confirmation=sc.nextLine();
		text3=text3.replaceFirst("<yORn>", confirmation);
		
		System.out.println(text3);
		
		
		
		

	}

}
