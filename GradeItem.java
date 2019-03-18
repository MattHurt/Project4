/*
* GradeItem Class: To hold data regarding information about GradeItems
* Anthony Irwin
* Project 1: GradeItem Class
* Windwos 10, jGrasp
* Impresario: noun [im-pruh-sahr-ee-oh] A person who organizes or manages public operas,
* 	ballets, concerts
* "There's no gene for fate." - Film, Gattaca
*/

//****************************************************************************************
//private variables for GradeItem Class

public class GradeItem
{
   private String studentId;  //STUDENT ID
   private int gradeId;       //GRADE ID
   private String courseId;   //COURSE ID
   private String itemType;   //ITEM TYPE
   private String date;       //DATE
   private int maxScore;      //MAX SCORE
   private int actualScore;   //ACTUAL SCORE
   private String typeArray[] = {"HW",
                                 "Quiz", 
                                 "Class Work", 
                                 "Test", 
   /*ARRAY OF ITEM TYPES*/        "Final"};
                                 
//****************************************************************************************
//default constructor that sets values to default

   public GradeItem()
   {
      this.studentId   = "";
      this.gradeId     = 0;
      this.courseId    = "";
      this.itemType    = "";
      this.date        = "";
      this.maxScore    = 0;
      this.actualScore = 0;
   }
   

//****************************************************************************************
//overload constructor that checks inputs

   public GradeItem(String studentId,
                    int gradeId, 
                    String courseId, 
                    String itemType, 
                    String date, 
                    int maxScore, 
                    int actualScore)
                    
      throws IllegalArgumentException
   {
      
      if (studentId.isEmpty()
         || courseId.isEmpty()
         || itemType.isEmpty()
         || date.isEmpty())
      {
         throw new IllegalArgumentException("One or more fields in GradeItem is empty");
      }
      if (maxScore <= 0)
      {
         throw new IllegalArgumentException(maxScore + " is less than or equal to 0.");
      }
      if (actualScore < 0 || actualScore > maxScore)
      {
         throw new IllegalArgumentException(actualScore + 
         "is less than 0 or greater than the maximum score.");
      }
      this.studentId   = studentId;
      this.gradeId     = gradeId; 
      this.courseId    = courseId; 
      this.itemType    = itemType; 
      this.date        = date; 
      this.maxScore    = maxScore;
      this.actualScore = actualScore; 
   }
   
//****************************************************************************************
//getter for studentId

   public String getStudentId()
   {
      return studentId;
   }
//****************************************************************************************
//getter for gradeId

   public int getGradeId()
   {
      return gradeId;
   }
   
//****************************************************************************************
//getter for courseId

   public String getCourseId()
   {
      return courseId;
   }

//****************************************************************************************
//getter for itemType

   public String getItemType()
   {
      return itemType;
   }
 
//****************************************************************************************
//getter for date

   public String getDate()
   {
      return date;
   }
   
//****************************************************************************************
//getter for maxScore

   public int getMaxScore()
   {
      return maxScore;
   }  

//****************************************************************************************
//getter for actualScore

   public int getActualScore()
   {
      return actualScore;
   }
 
//****************************************************************************************
//toString statement

   public String toString()
   {
      String display = "\nStudent ID: "   + studentId
                     + "\nGrade ID: "     + gradeId
                     + "\nCourse ID: "    + courseId
                     + "\nItem Type: "    + itemType
                     + "\nDate: "         + date
                     + "\nMax Score: "    + maxScore
                     + "\nActual Score: " + actualScore;
      return display;
   }

 //***************************************************************************************
//Comparing two instances to see if they have the exact same data
   
   public boolean equals(GradeItem other)
   {
   if (studentId.equals(other.studentId)
      && courseId.equals(other.courseId)
      && gradeId == other.gradeId
      && itemType.equals(other.itemType)
      && date.equals(other.date)
      && maxScore == other.maxScore
      && actualScore == other.actualScore)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

}
