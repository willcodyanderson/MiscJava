
/**
Name:William Anderson
ID: N01046945
Teacher: Kenneth Baker
Date:November 13th 2015
Course:CENG 212
File Name: Salesman.java
*/

import java.io.*;
import java.util.*;

public class UseCompany
{
   public static void main(String args[])
   {
     File EmployeeFile = new File ("EmployeeData.txt");
     Technician t1,t2;
     t1 = new Technician("Jerry",12345,4,"Field Service");
     t2 = new Technician("Ricky",9362,2,"Production");
     SalesMan s1,s2;
     s1 = new SalesMan("Phil",45645,5642.00,"Miami");
     s2 = new SalesMan("Steve",43497,3254.00,"New York");
     
     Employee myCompany[] = {t1,t2,s1,s2};
     Arrays.sort(myCompany);
     FileIO.writeAsText(myCompany, "EmployeeData.txt");
     //for(int i = 0; i < myCompany.length; i++) 
     //{
     // System.out.println(myCompany[i]);
      //System.out.println("Text Testing\n");
      //FileIO.writeAsText(myCompany, "EmployeeData.txt");
      //Employee emp[] = FileIO.loadArray("");
      //for(int i = 0; i < emp.length; i++);
     //}
   }
}