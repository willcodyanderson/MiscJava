import java.io.*;
public class Employee implements Comparable,Serializable 
{
   private int i;
	private String name;			// Name of employee
	private int number;			// Employee number of employee
	
	/**
	* Constructor  to create the superclass
	* @param nom Name of the employee
	* @param number Employee number
	*/
	public Employee(String nom, int number )
	{
		name = nom;
		this.number = number;
	}
   public String GetName()
   {
      return name;
   }
   public int GetNumber()
   {
      return number;
   }
	public void SetName(String name)
   {
      this.name = name;
   }
   public void SetNumber(int number)
   {
      this.number = number;
   }
	// getters and setters as necessary

	/**
	* compareTo method for comparison of objects
	* @param Employee object
	* @return An integer to indicate comparison  
	*/   
	public int compareTo(Object o)
	{
      //String i = (String)GetNumber();
      //i = i;
     if(GetNumber() > ((Employee)o).GetNumber())
			return 1;	//greater than
		else if  (GetNumber() < ((Employee)o).GetNumber())
			return -1;	// less than
		else
			return 0;	//equal
 	}
	
	/** toString method for printing */
	public String toString()
	{
      return "," + this.name + "," + this.number;
		 /**String temperary;
        
        temperary = "" + i;
        
        return temperary;**/
	}
}