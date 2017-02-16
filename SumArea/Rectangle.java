/**
* This is a demonstration of inheritance
* Class accredited to Liang, 6th Edition. Will be implemented for coursework.
*/
public class Rectangle extends GeometricObject	// explicitly extends GeometricObject
{
	private double width;	// width of the rectangle
	private double height;	// height of the rectangle
	
	// Construct retangle with width and height
	// with implicit super(), that is from GeometricObject
	public Rectangle(double width, double height) {
		this.width = width; this.height = height; }
	
	// Return width
	public double getWidth() { return width; }
	
	// Set a new width
	public void setWidth(double width) { this.width = width; }
	
	// Return height
	public double getHeight() { return height; }
	
	// Set a new height
	public void setHeight(double height) { this.height = height; }
	
	// Return area
	public double getArea() { return width * height; }
	
	// Return perimeter
	public double getPerimeter() { return 2 * (width + height); }
}	
	