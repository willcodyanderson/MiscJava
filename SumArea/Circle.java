/**
* This is a demonstration of inheritance
* Class accredited to Liang, 6th Edition. Will be implemented for coursework.
*/
public class Circle extends GeometricObject	// explicitly extends GeometricObject
{
	private double radius;
	
	// Construct default circle
	// with implicit super(), that is from GeometricObject
	public Circle() { }
	
	// Construct circle with radus 
	// with implicit super(), that is from GeometricObject
	public Circle(double radius) { this.radius = radius; }
	
	// Return radius
	public double getRadius() { return radius; }
	
	// Set radius
	public void setRadius(double radius){ this.radius = radius; }
	
	// Get area
	public double getArea() { return radius * radius * Math.PI; }
	
	// Get diameter
	public double getDiameter(){ return 2 * radius; }
	
	// Get perimeter
	public double getPerimeter() {return 2 * radius * Math.PI; }
	
	// Print circle information
	public void printCircle(){
		System.out.println("Circle created: " + getDateCreated() + " and radius: " + radius); }
}