//A class to demonstrate shallow and deep clones

public class Course implements Cloneable 
{
 private String courseName;
 
 private static String[] students = new String[5];
 
 private int numberOfStudents;
 
 public Course(String courseName) 
 {
   this.courseName = courseName;
 }
 public void addStudent() 
 {
   int i;
   for(i=0;i<=4;i++)
   {
      students[i] = IO.readString();
   }
 }

 public String[] getStudents() 
 {
 return students;
 }

 public int getNumberOfStudents() 
   {
   return numberOfStudents;
   }

   public String getCourseName() 
   {
   return courseName;
   }
 
   public String[] copystudents() 
   {
	//Deep copy
	String[] student2 = students.clone();
	return student2;
   }
   public void display(String[] students)
   {
      int i;
         for(i=0;i<=4;i++)
      {
         System.out.print(students[i] + " ");
      }
         System.out.println("");
   }

public static void main(String[] args) 
{
Course testcourse = new Course("course");
System.out.println("Please Enter Five Students");
testcourse.addStudent();
String[] student2 = testcourse.copystudents();
System.out.println("Please Enter Five New Students");
testcourse.addStudent();
System.out.println("The first Students were: ");
testcourse.display(student2);
System.out.println("The second Students were: ");
testcourse.display(students);
}
}
