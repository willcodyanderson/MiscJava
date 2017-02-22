// If you do not have a compiler, feel free to copy and paste the code into https://www.compilejava.net/ and run it.

/** A class to create my cover letter on the system console.
*/

//@author William Anderson

public class  CoverLetter{

    public static void main(String[] args) {
    String recipient = "Company Name";
    String positionName = "Position Name";
    String myName = "My Name";
    String myNumber = "XXX-XXX-XXXX";
    String myEmail ="myemail@gmail.com";
    String[] Skills = {"Experience in developing with Java", "Experience in the Development and Deployment of Android Applications", "Relational Databases in SQL", "Experience with Java Server Pages", "Experience with client/server application, both client side and back end","An Aptitude for expanding knowledge and learning new skills"};
    
    //some concatenation used for appropiate formatting in my IDE
    System.out.println("Dear " + recipient + " HR Manager,\n\n");
    System.out.println("This letter is to express my interest in your job posting online for a " + positionName + ".\n" +
    "With an education in Computer Engineering Technology, as well as my independent work, I have plenty of \nhands on experience in" + 
    " developing with Java and Android, and am confident I would be an asset to your company.\n" );
    
    System.out.println("Your listed requirements closely match my background and skills. A few I would like to highlight\nthat would enable " + 
     "me to contribute to your company are:\n");
     
     for(int i = 0;i < Skills.length;i++)
     {
     System.out.println("- " + Skills[i]);
     }
     
     System.out.print("\nI've attached a copy of my resume, which lists my experience and projects. I can be reached\nanytime via my cell phone, " +
     myNumber + ", or my email at " + myEmail + ".\n\n");
     System.out.print("\nThank you for your time and consideration. I look forward to hearing from you about this opportunity.\n\n");
     System.out.print("Sincerely,\n\n" + myName);
    }
}
