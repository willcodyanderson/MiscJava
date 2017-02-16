/**
Name:Sanjay Jerad
Date:October 30th 2015
Course:CENG 212
Email:Sanjay.acura@hotmail.com
File Name:Car DealerShip
OS: Windows
*/

import java.util.ArrayList;
import java.lang.Comparable;
import java.lang.Cloneable;

public class Car implements Comparable <Car>, Cloneable 
{
   private String model, color;
   private int year, vinNumber;
   private double price;
/**
Method allows the variables for each thing to be declared
with hard code of the value for string and int to zero
@param Cars returns the Car in the hard code it is given.
*/
   public Car()
      {
      model = "go-kart";
      color = "blue";
      year = 2015;
      vinNumber = 457327;
      price = 60000;
      }
/**
Method allows the variables to be given a name to be used in
the programming code.
@param Car assigns the varables to a name for them to be used 
in the coding scheme.
*/
   public Car (String models, String colour, int years,  int vinNumbers, double prices)
   {
         this.model = models;
         this.color = colour;
         this.year = years;
         this.vinNumber = vinNumbers;
         this.price = prices;
 
      }
/**
The method allows the varaiable in String to be given 
the model a new name.
@param mod reference's to the LinkedList which sets the model. 
*/
      public void setModel(String mod)
      {
         model = mod;
      }
/**
The method returns the value that the getModel gets and returns
them as the variable of model
@param Returns Returns nothing.
*/
            
      public String getModel()
      {
         return model;
      }
/**
The method allows the variable in String to be given
the color a new name.
@param color refernces to the LinkedList which sets the color.
*/
      public void setcolour(String colors)
      {
         color=colors;
      }
/**
Method returns the value that the getColour gets and returns
them as the variable of color
@param Return Returns nothing.
*/
      public String getColour()
      {
         return color;
      }
/**
The method allows the variable into the integer to be given
the Year as a new name.
@param Cyear references it the LinkedList which sets the year.
*/
      public void setYear(int Cyear)
      {
         year = Cyear;
      }
/**
Method returns the value that the getYear gets and return
them as the variable of color
@param Return Returns nothing.  
*/
      public int getYear()
      {
         return year;
      }
/**
The method allows the variable into the integer to be given
the VinNum asa new name.
@param VinNumb reference it the LinkedList which sets the VinNumber.
*/
      public void setVinNum(int VinNumb)
      {
         vinNumber = VinNumb;
      }
/**
Method returns the value that the getVinNum gets and return
them as the variable of VinNum.
@param Return Returns nothing.
*/
      public int getVinNum()
      {
         return vinNumber;
      }
/**
The method allows the variable into th integer to be given
the CPrice as a new name.
@param CPrice reference into the LinkedList which sets the Price.
*/
      public void setPrice(double CPrice)
      {
         price = CPrice;
      }
/**
Method returns the value that the getPrice gets and return
them as the vriable of price.
@param Return Returns nothing.
*/
      public double getPrice()
      {
         return price;
      }
/**
Method will assign the variable in the order the user what it and then
displays them with the values of each variable.
@param Return Returns nothing only assigning the variables.
*/
      public String toString()
      {
          return  ("color: " + color + " Model:  " + model + " Year: "  + year + " VinNumber: " + vinNumber);
      }
/**
Method compares the object if it is greater then or less than
the getModel.
@param o the reference object with which it is initalized
with an integer.
@return return a 1 if it is greter than getModel, returns
  a -1 if less than getModel, and if both are are not true then it will equal
  returning a 0.
*/       

     public int compareTo(Car o)
	 {
		int mod = getModel().compareTo(o.getModel());
      if(mod == 1)
      {
         return mod;
      }
      else if (mod == -1)
      {
         return mod;
      }
      else
      return mod;
			
	}
      

         
 }