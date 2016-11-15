/**
Name:William Anderson
ID: N01046945
Teacher: Kenneth Baker
Date:November 13th 2015
Course:CENG 212
File Name:SalesMan.java
*/
import java.io.*;
import java.util.*;
/**
This is the class that contains all the methods of reading and writing the array to different files
in different ways. It also has a method to display the contents of the employee array.
*/
public class FileIO
{
	/**The method that writes the text into the file.
   @param has an array of employee objects and a filename as arguments
   */
   public static void writeAsText(Employee tempCompany[], String Filename)
	{
	//Test to see if the file can be written to; if not, it goes to the catch exception
	   try
		{	
			BufferedWriter writer = new BufferedWriter(new PrintWriter(new File(Filename)));//creating a new writer
			int i = 0;
			for(i = 0; i < tempCompany.length; i = i + 1)
			{
				writer.write(tempCompany[i].toString());//writing the file as text
				writer.newLine();//going to the next line			
			}
			writer.close();			}
		//If the file is not found, say there is no file
		catch(FileNotFoundException ferror)
		{
		   System.out.println("The file was not found");
			return ;
	   }
		//If an error occurs whilst writing to the file
		catch(IOException r_werror)
		{
		   System.out.println("An error has occured");	   
		}
	}
   
   /**
   The method that reads text from a file and stores it into an array of employee objects
   @param takes a Filename as an arguement(The file that will be read from and loaded into the array)
   */
   
   public static Employee[] LoadArray(String Filename)throws IOException, FileNotFoundException
   {
      FileReader newReader = new FileReader(Filename);//creating a new reader
      BufferedReader buffread1 = new BufferedReader(new FileReader(Filename));//creating a buffered reader
      int count = 0, indexs = 0;
      
      while ((buffread1.readLine()) != null)//terminates upon a null (end of employee strings)
      {
         count++;//increments the counter
      } 
      FileReader newReader1 = new FileReader(Filename);//creating another new reader
      BufferedReader buffread2 = new BufferedReader(new FileReader(Filename));
      Employee[] objects = new Employee[count];//creating the new array according to how many employees there are.
      String ReadaLine = "";
      
      while ((ReadaLine = buffread2.readLine()) != null)//while the string isn't at the end
      {
         String[] splitString = ReadaLine.split(",");//splits the different variables of the objects up at commas
         String TS = splitString[0];
         
      }
	/**
   The method that writes objects to the file exactly as they are. It results in unreadable gibberish in the file.
   @param has an employ array and file name as arguements.
   */

	public static void writeObject(Employee emply[],String fname) throws ClassNotFoundException
	{
	   try//tests to see if the file can be written to, else goes to the catches.		 
		{  
			File employf = new File(fname);  //creates a new file with the name provided
			BufferedOutputStream myBuffer = new BufferedOutputStream(new FileOutputStream(employf)); 
		   ObjectOutputStream employOF = new ObjectOutputStream(myBuffer);//Creates a new Object Output stream 
			int i = 0;
			for(i = 0; i < emply.length; i = i + 1)//for the number of employees in array
			{
				employOF.writeObject(emply[i]);//write the object 
				employOF.flush();// flushes the character from the write buffer.
			}
			employOF.close(); //closing the writer
		 }
		 catch(FileNotFoundException ferror3)
		 {
		 	System.out.println("The File was not found");
		 }
		 catch(IOException r_werror1)
		 {
		 	System.out.println("Writing Error Object");	   
		 }
	}
	/**
   The method that reads objects from the file
   @param takes the filename of the file it's supposed to read from/
   */
	public static Employee[] readObject(String fname)
   {
	    ArrayList <Employee> employl = null;    
		 try//see if the file can be read from, else go to the catches.
		 {	    
		    File employF = new File(fname);
			 ObjectInputStream read_employeefile = new ObjectInputStream(new BufferedInputStream(new FileInputStream(employF)));
			 employl = new ArrayList<Employee>();// new array to store read employee objects into.
			 for(;;)
			 {
            //adding the objects back into the array. They convert back properly.
			 	employl.add((Employee)read_employeefile.readObject());
			 }
		 }
		 catch(FileNotFoundException fileerror)
		 {
		    System.out.println("The File was not found");
			 return null;
		 }
		 catch (EOFException EOFE){}
		 catch(IOException IOE)
		 {
		   System.out.println("Reading Error Object");;	   
		 }
		 catch(Exception eof){}
		 Employee employees[] = new Employee[employl.size()];
		 int i = 0;
		 for(i = 0; i < employl.size(); i = i + 1)
		 {
		 	employees[i]=employl.get(i);
		 }
       return employees;
	}
*/
}
}
