public class SumArea
{
   public static GeometricObject[] array = new GeometricObject[4];
   
   public static double sumArea(GeometricObject[] a)
   {
      int i;
      double sum =0;
      //hardcoded values for testing
      Circle circleOne = new Circle(2.00);
      Circle circleTwo = new Circle(4.00);
      Rectangle rectangleOne = new Rectangle (4.00, 2.00);
      Rectangle rectangleTwo = new Rectangle (8.00, 4.00);
      sum = sum + circleOne.getArea();
      sum = sum + circleTwo.getArea();
      sum = sum + rectangleOne.getArea();
      sum = sum + rectangleTwo.getArea();

      return sum;
   
   }
   
   
   

public static void main(String[] args) 
{
   SumArea testSumArea = new SumArea();
   System.out.println("The total Area of all objects is: " + SumArea.sumArea(array));
}
}