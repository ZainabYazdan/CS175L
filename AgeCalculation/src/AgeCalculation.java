import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
public class AgeCalculation {

	public static void main(String[] args) {
		
		String birthday=JOptionPane.showInputDialog("Enter your birthday (MM/DD/YYYY): ");
		String CurrentDate=JOptionPane.showInputDialog("Enter current date (MM/DD/YYYY): ");
		
		LocalDate Birthday=LocalDate.parse(birthday, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		LocalDate Date=LocalDate.parse(CurrentDate, DateTimeFormatter.ofPattern("MM/dd/yyyy"));
		
		Period Age= Period.between(Birthday, Date);
		
		JOptionPane.showMessageDialog(null, "You are "+ Age.getYears() + " years and "+ Age.getMonths()+" month(s) old.");
		

	}

}