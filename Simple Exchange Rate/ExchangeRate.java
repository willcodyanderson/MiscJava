// A simple programme to print "Hello World"
// William Anderson CENG 212 
// Microsoft Windows, HelloWorld.java
// Java Version is "1.8.0_45"
// The full path for the java c executable is C:\Program Files\Java\jdk1.8.0_45\bin

public class ExchangeRate
{
  public static void main(String[] args)
  {
	double rate, amountOne, amountTwo, convert;
	// rate is the current U.S dollar to RMB exchange rate
	//convert is if they'd like to go from U.S to RMB or vice versa
	//amount is the amount they want converted
	//amountTwo is the amount after conversion
	   

	System.out.print("Enter the exchange rate from dollars to RMB: ");
	rate = IO.readDouble();
	System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
	convert = IO.readDouble();
	System.out.print("Enter the dollar amount: ");
	amountOne = IO.readDouble();

	if (convert == 0) 
	{
		amountTwo = amountOne*rate;
	}
	else
	{
		amountTwo = amountOne/rate;
	}
        System.out.println("$" + amountOne + " is " + amountTwo + " yuan");


  
	}
}
