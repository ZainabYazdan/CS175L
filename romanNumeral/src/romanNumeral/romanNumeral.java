package romanNumeral;
import java.util.Scanner;
public class romanNumeral {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("Please enter the number you want to convert: ");
		int number=in.nextInt();
		
		int unit=number/1%10;
		int tens=number/10%10;
	    int hundredth=number/100%10;
		int thousand=number/1000%10;
		
		String years=String.valueOf(unit);
		String decade=String.valueOf(tens);
		String century=String.valueOf(hundredth);
		String millennium=String.valueOf(thousand);
		
		if(unit==1)
			years="I";
		else if(unit==2)
			years="II";
		else if(unit==3)
			years="III";
		else if (unit==4)
			years="IV";
		else if(unit==5)
			years="v";
		else if(unit==6)
			years="VI";
		else if(unit==7)
			years="VII";
		else if(unit==8)
			years="VIII";
		else if(unit==9)
			years="IX";
		else if(unit<1)
			years= ("");
		
		
		if (tens==1)
			decade="X";
		else if(tens==2)
			decade="XX";
		else if(tens==3)
			decade="xxx";
		else if(tens==4)
			decade="XL";
		else if(tens==5)
			decade="L";
		else if(tens==6)
			decade="LX";
		else if(tens==7)
			decade="LXX";
		else if(tens==8)
			decade="LXXX";
		else if(tens==9)
			decade="XC";
		else if(tens<1)
			decade=("");
		
		if(hundredth==1)
			century="C";
		else if(hundredth==2)
			century="CC";
		else if(hundredth==3)
			century="CCC";
		else if(hundredth==4)
			century="CD";
		else if(hundredth==5)
			century="D";
		else if(hundredth==6)
			century="DC";
		else if(hundredth==7)
			century="DCC";
		else if(hundredth==8)
			century="DCCC";
		else if(hundredth==9)
			century="CM";
		else if(hundredth<1)
			century=("");
		
		if(thousand==1)
			millennium="M";
		else if(thousand==2)
			millennium="MM";
		else if(thousand==3)
			millennium="MMM";
		else if(thousand>3)
			millennium=null;
		else if (thousand<1)
			millennium=("");
		
		if (number<1 || number>3999)
			{System.out.print("Roman numeral not available");}
		
		else 
			System.out.print("Roman numeral: "+millennium+century+decade+years);
		
		
			
			
			
			
			
			
			
		
	}
}
		 
		