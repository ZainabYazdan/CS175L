import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class RoachPopulation
{

	DecimalFormat wholeFormat=new DecimalFormat("0");
	
	
	public double population;
	public int cycle=0;
	
	public RoachPopulation(int initialpop)
	{
		population= initialpop;		 
		JOptionPane.showMessageDialog(null, "The initial Roach Population is: "+initialpop);
	}
	
	public void breed()
	{
		population =population*2;	
		cycle=cycle+1;
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle "+ cycle+ " breeding is "+ wholeFormat.format(population));
		
	}
	
	public void spray(int sprayPct)
	{
		population=(population)-((sprayPct/100.0)*population);
		JOptionPane.showMessageDialog(null, "The Roach Population after cycle "+ cycle +" "+ sprayPct + "% spraying is "+wholeFormat.format(population));
					
	}
	public double getRoaches()
	{
	return population;	
	}
	
}


