/**
* This is a demonstration of inheritance
* Class accredited to Liang, 6th Edition. Will be implemented for coursework.
*/
public class GeometricObject
{
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	// Constructor to set the date
	public GeometricObject() 	// implicitly extends Object
	{ dateCreated = new java.util.Date(); 	}	// implicit super();
	
	// Return color of object
	public String getColor() { return color;  }
	
	// Set color of object
	public void setColor(String color) {  this.color = color;  }
	
	// Return boolean whether object is filled
	public boolean isFilled(){  return filled;  }
	
	// Set boolean that object is filled
	public void setFilled(boolean filled) { this.filled = filled; }
	
	// Get date created
	public java.util.Date getDateCreated(){ return dateCreated;  }
	
	// Return the big-Oh object toString
	public String bigOhtoString(){ return super.toString(); }
	
	// Return string representation of this object
	public String toString() {
		return "Created: " + dateCreated + "\nColor: " + color + " , Filled: " + filled; }
}