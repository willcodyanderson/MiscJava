//William Anderson
//N01046945
//Algorithms and Data Structures in Java Assignment 2
 
 import java.util.Scanner;
 import java.lang.*;
 
 public class LargestRowColumn {
 
   public static void main(String[] args) {
   
      int number; 
      int oneCount = 0;
      int oneColumn = 0;
      int topCount = 0;
      Scanner input = new Scanner(System.in);
      System.out.print("Please Enter the array size: ");
      number = input.nextInt();
      
      int[][] array = new int[number][number];
      
      //Assign random 0's and ones to the array
      for(int i =0;i<array.length;i++)
      {
         for (int j =0;j<array.length;j++)
         {
           if(Math.random()>0.49)
           {
            array[i][j] = 1;
           }
           else
           {
            array[i][j] =0;
           } 
         }
      }
      
      // print out the array
      for(int i =0;i<array.length;i++)
      {
         for (int j =0;j<array.length;j++)
         {
         System.out.print(array[i][j]);
         }
         System.out.print("\n");
      }
      
      //find out the max number of ones in any given row
      for(int i =0;i<array.length;i++)
      {
         for (int j =0;j<array.length;j++)
         {
            if(array[i][j]==1)
            {
               oneCount ++;  
            }
         }
         if (oneCount > topCount)
         {
            topCount=oneCount;
         }
         oneCount=0;
      }
      //find rows that have max number of ones
      System.out.print("rows with the most ones: ");
       for(int i =0;i<array.length;i++)
      {
         for (int j =0;j<array.length;j++)
         {
            if(array[i][j]==1)
            {
               oneCount ++;  
            }
         }
         if (oneCount == topCount)
         {
            System.out.print(i + " ");
         }
         oneCount=0;
      }
      System.out.print("\n");
      topCount =0;
      oneCount=0;
      //find max number of ones in any given column
       for(int i =0;i<array.length;i++)
      {
         for (int j =0;j<array.length;j++)
         {
            if(array[j][i]==1)
            {
           // System.out.print(array[j][i]); 
               oneCount ++;  
            }
         }
         if (oneCount > topCount)
         {
            topCount=oneCount;
         }
         oneCount=0;
      }  

      System.out.print("columns with the most ones: ");  
      for(int i =0;i<array.length;i++)
      {
         for (int j =0;j<array.length;j++)
         {
            if(array[j][i]==1)
            {
               oneCount ++;  
            }
         }
          if (oneCount == topCount)
         {
            System.out.print(i + " ");
         }
         oneCount=0;
      }  
      
      
      

   }
}