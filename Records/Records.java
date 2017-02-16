
public class Records implements Comparable
{
   private int i;
/**
Method allows the variable i to be declared with a zero. 
@ no parameters.
*/   
   public Records()
   {
      i = 0;
   }
/**
The records will store the value of i into the z int variable
@param passes z
i with an integer to z.
*/
   public Records(int z)
   {
     i = z;  
   } 
/**
Method gives the value initalized from the i and gives
then to the z variable integer.
@param passes z.
*/
   public void Setter(int z)
   {
      i = z;
   }
/**
Method returns the values that the getter gets and returns
them as the variable of i.
@param no parameters
*/   
   public int Getter()
   {
     return i; 
   }
/**
Method will store the temporary as whatever plus the i.
@param String this will intialize it as temperary and
them return it.
@return returns a String which is named temperary
*/
     public String toString()
    {
        String temperary;
        
        temperary = "" + i;
        
        return temperary;
    }
/**
Method compares the object if it is greater than or less than
the getter.
@param passes the reference object with which it is
initalzed with an integer. Returns a 1 if it is greater in value than Records, returns
a -1 if it is less in value than Records, and if both are are not true then it will be equal, thus
returning a 0.
*/
    
    public int compareTo(Object o)
	{
		if (Getter() > ((Records)o).Getter())
			return 1;	//greater than
		else if  (Getter() < ((Records)o).Getter())
			return -1;	// less than
		else
			return 0;	//equal
	}
}
