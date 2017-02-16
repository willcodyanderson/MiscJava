// A simple programme to display nested loops"
// William Anderson CENG 212 
// Microsoft Windows, NestedLoop
// Java Version is "1.8.0_45"
// The full path for the java c executable is C:\Program Files\Java\jdk1.8.0_45\bin

public class NestedLoop
{
  public static void main(String[] args)
  {

	int i, j, ii; 
	// i is the outer loop counter
	// j is the inner loop counter
  	
	for (i=1;i<=6;i++)

	{
		for (j = 1; j<=i ;j++)
		{
			System.out.print(j +" ");
		}
	
		j=0;

		System.out.println("");
	}
	
		System.out.println("");

	  	
	for (i=6;i>=1;i--)

	{
		for (j = 1; j<=i ;j++)
		{
			System.out.print(j +" ");
		}
	
		j=0;

		System.out.println("");
	}
	
		System.out.println("");


	for (i=1;i<=6;i++)

	{
		for (j = 6; j>=1 ;j--)
		{
			if (j>i)
			{
				
				System.out.print("  ");
			}
			else
			{
				System.out.print(j +" ");
			}
		}
	
		j=0;

		System.out.println("");
	}
	
		System.out.println("");

	for (i=6;i>=1;i--)
	

	{

		for (ii=6-(i-1);ii>=0;ii--)

 		 {
				
			System.out.print("  ");

  		}

		for (j =1; j<=i ;j++)

		{
			

			System.out.print(j +" ");
			
		}
	
		j=0;

		System.out.println("");
	}
	
		System.out.println("");

	}
	
	
}
