import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class RoachSimulation {

	public static void main(String[] args) {
		int initialpop = 0;
		double population = 0;
		int SprayPct = 0;
		
	String roaches=JOptionPane.showInputDialog("Enter starting roach population: ");
	initialpop=Integer.parseInt(roaches);
	
	RoachPopulation bugs=new RoachPopulation(initialpop);	
	
	  bugs.breed();
	
	 String Spray=JOptionPane.showInputDialog("Enter spray percentage for cycle 1: ");
	 SprayPct=Integer.parseInt(Spray);
	 bugs.spray(SprayPct);
	 
	 Spray=JOptionPane.showInputDialog("Enter spray percentage for cycle 2: ");
	 SprayPct=Integer.parseInt(Spray);
	 bugs.breed();
	 bugs.spray(SprayPct);
	 
	 Spray=JOptionPane.showInputDialog("Enter spray percentage for cycle 3: ");
	 SprayPct=Integer.parseInt(Spray);
	 bugs.breed();
	 bugs.spray(SprayPct);
	 
	 Spray=JOptionPane.showInputDialog("Enter spray percentage for cycle 4: ");
	 SprayPct=Integer.parseInt(Spray);
	 bugs.breed();
	 bugs.spray(SprayPct);
	 
	 
	 bugs.getRoaches();
	  
	  
	
	}

}
