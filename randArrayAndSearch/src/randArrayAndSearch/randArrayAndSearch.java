package randArrayAndSearch;

import java.util.Random;

public class randArrayAndSearch {

	public static void main(String[] args) {
		
		
		int[] values=new int[50];
		
		
		Random num=new Random();
		
		for (int i=0; i<values.length; i++)
	    {
			int random=num.nextInt(25) + 1; 
			values[i]=random;
			System.out.print(values[i]);
			if (i<values.length - 1)
		{
				System.out.print(", ");
		}
		}
		
		System.out.println();
		int largest=values[0];
		int smallest=values[0];
		
		for (int a=1; a<values.length; a++)
		{
			if (values[a]>largest)
		{
				largest=values[a];
		}
			if (values[a]<smallest)
		{
				smallest=values[a];
		}			
		}
		
		int product=largest * smallest;
		
		
		
		System.out.println("Smallest integer is " + smallest+ " and largest integer is "+ largest+".");
		System.out.println("Product of largest and smallest integer is " + product+".");
		
		
		System.out.println();
		System.out.println("Extra Credit");
		int frequentNumber=0;;
		int count = 0;
		
		for (int z=0; z<values.length; z++)
		{
			int Element=values[z];
			int Count=0;
			for (int l=0; l<values.length; l++)
			{
				if (values[l]==Element)
				{
					Count++;
				}
			}
			if (Count > count)
			{
				frequentNumber = Element;
				count = Count;
			}
		}
		
		System.out.println("Most frequent number in array is " + frequentNumber + " and it appears " + count + " times.");

	}

}