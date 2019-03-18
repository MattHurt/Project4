/*
* Student Class: To hold data regarding information about students
* Anthony Irwin
* Project 1: Student Class
* Windwos 10, jGrasp
* eloquence: noun [el-uh-kwuh-ns] The practice or art of using language with fluency and
* 	aptness
* "Never save anything for the swim back" - Film, Gattaca 
*/

//****************************************************************************************
//Private Varibales for Student Class

public class Student
{
   private String studentId; //studenId
   private String firstName; //firstName
   private String lastName;  //lastName
   private String email;     //email

//****************************************************************************************
//default constructor that sets values to default

   public Student()
   {
      this.studentId = "";
      this.firstName = "";
      this.lastName  = "";
      this.email     = "";
   }
   
//****************************************************************************************
//overlload constructor that checks inputs

   public Student(String studentId, 
                  String firstName, 
                  String lastName, 
                  String email)
      throws IllegalArgumentException
   {
      if (studentId.isEmpty()
      || firstName.isEmpty()
      || lastName.isEmpty()
      || email.isEmpty())
      {
         throw new IllegalArgumentException("One or more fields in Student is empty");
      }
      if (!email.contains("@"))
      {
         throw new IllegalArgumentException(email + ": does not contain @");
      }
      this.studentId = studentId;
      this.firstName = firstName;
      this.lastName  = lastName;
      this.email     = email;
      
   }
   
//****************************************************************************************
//getter for studentId
   
   public String getStudentId()
   {
      return studentId;
   }
   
//****************************************************************************************
//getter for firstName
   
   public String getFirstName()
   {
      return firstName;
   }

//****************************************************************************************
//getter for lastName
   
   public String getLastName()
   {
      return lastName;
   }

//****************************************************************************************
//getter for email
   
   public String getEmail()
   {
      return email;
   }
    
//****************************************************************************************
//toString statement

   public String toString()
   {
      String display = "\nStudent ID: " + studentId
                     + "\nFirst Name: " + firstName
                     + "\nLast Name: "  + lastName
                     + "\nEmail: "      + email;
      return display;
   }
      
//****************************************************************************************
//Comparing two instances to see if they have the exact same data

   public boolean equals(Student other)
   {
   if (studentId.equals(other.studentId) 
      && firstName.equals(other.firstName)
      && lastName.equals(other.lastName)
      && email.equals(other.email))
      {
         return true;
      }
      else
      {
         return false;
      }
   }
}
