import java.util.*;
class Course {
       static String courseName; 
       static int numberOfTests;
       static int numberOfStudents;
       int[][] marks; 

    void initMarksArray() {

        marks = new int[numberOfStudents][numberOfTests]; 

    }

    void studentdatainput (){
        Scanner input = new Scanner(System.in);
        for (int i = 0 ; i < numberOfStudents ; i++){
            System.out.println("Enter Student "+(i+1)+" Test Marks");
            for (int j=0 ; j<numberOfTests ; j++)
            {
                System.out.println("Please Enter Test "+ (j+1)+" Marks");
                marks[i][j]= input.nextInt();
            }
        }
    }
    void displayallStudentDetail(){
       
        System.out.println("Student Detail");
        System.out.println("Course Name :" + courseName );
       for (int i = 0 ; i < numberOfStudents ; i++){
            System.out.println("Student "+(i+1)+" Test Marks");
            for (int j=0 ; j<numberOfTests ; j++)
            {
                System.out.println("Test " + (j +1) + " Marks " + " -> " + marks[i][j] );
             
            }
        }
    }
}

public class CourseStudentTestData {
      
    public static void main(String[] args) {
        Course Studentdetail = new Course();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Subject Name ");
        Course.courseName= input.nextLine();
        System.out.println("---------------------");
        System.out.println("Please Enter Number of Students");
        Course.numberOfStudents = input.nextInt();
        System.out.println("Please Number of the test ");
        Course.numberOfTests = input.nextInt();

        try {  Studentdetail.initMarksArray();
               Studentdetail.studentdatainput();
        } catch (Exception e) {
            System.out.println("Problem in Accessing The Method of the Class ");
            System.out.println(e);
        }
        try {   
            Studentdetail.displayallStudentDetail();
        } catch (Exception e) {
            System.out.println("Problem in Display Accessing The Method of the Class ");
            System.out.println(e);
        }

 }
}

