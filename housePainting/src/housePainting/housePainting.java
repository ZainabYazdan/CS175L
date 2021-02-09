package housePainting;
import java.util.Scanner;
public class housePainting {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int Length= 0;
		int Width=0;
		int Height=0;
		int numOfWindows=0;
		int windowLength=0;
		int windowWidth=0;
		int numOfDoors=0;
		int doorWidth=0;
		int doorLength=0;
		double costCharged=0;
		double finalCost=0;
		int WSQFT=0;
		int DSQFT=0;
		int windowsAndDoors=0;
		int SQFT1=0;
		int SQFT2=0;
		int SQFT=0;
		int sqftToPaint=0;
		System.out.print("Please enter the length of the house: "); 
        Length= in.nextInt();
        System.out.print("Please enter the width of the house: " );
        Width= in.nextInt();
        System.out.print("Please enter the height of the house: ");
        Height=in.nextInt();
        System.out.print("Please enter the number of windows: ");
        numOfWindows= in.nextInt();  
        System.out.print("Please enter the length of windows: ");
        windowLength= in.nextInt();
        System.out.print("Please enter the width of windows: ");
        windowWidth=in.nextInt();
        System.out.print("Please enter number of doors: ");
        numOfDoors=in.nextInt();
        System.out.print("Please enter the width of doors: ");
        doorWidth=in.nextInt();
        System.out.print("Please enter the length of doors: ");
        doorLength=in.nextInt();
        System.out.print("Please enter the cost charged per square ft: ");
        costCharged= in.nextInt();
        WSQFT= numOfWindows*windowWidth*windowLength;
        DSQFT= numOfDoors*doorWidth*doorLength;
        windowsAndDoors= WSQFT+DSQFT;
        SQFT1=2*Width*Length;
        SQFT2= SQFT1 + 2*((Length*(Height-Width))/2);
        SQFT=SQFT1+SQFT2;
        sqftToPaint= SQFT-windowsAndDoors;
        finalCost= sqftToPaint*costCharged;
        System.out.println("Your total paintable surface area is "+sqftToPaint+" square feet.");
	
	
        System.out.println("Your estimate of painting this house is "+finalCost+" dollars.");
	  
        
        
        
        
	}
	

}
 