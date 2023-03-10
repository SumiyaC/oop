package oop;
	// Fig. 7.19: GradeBookTest.java
	// GradeBookTest creates GradeBook object using a two-dimensional array  
	// of grades, then invokes method processGrades to analyze them.
	public class GradeBookTest2 {
	   // main method begins program execution
	   public static void main(String[] args) {
	      // two-dimensional array of student grades
	      int[][] gradesArray = {{87, 96, 70},      
	                             {68, 87, 90},      
	                             {94, 100, 90},     
	                             {100, 81, 82},     
	                             {83, 65, 85},      
	                             {78, 87, 65},      
	                             {85, 75, 83},      
	                             {91, 94, 100},     
	                             {76, 72, 84},      
	                             {87, 93, 73}};     
	      
	      GradeBook2 myGradeBook = new GradeBook2(
	         "CS101 Introduction to Java Programming", gradesArray);
	      System.out.printf("Welcome to the grade book for%n%s%n%n", 
	         myGradeBook.getCourseName());
	      myGradeBook.processGrades();
	   } 
	}
/*package oop;
import java.util.Scanner;

// GradeBookTest creates GradeBook object using a two-dimensional array  
// of grades, then invokes method processGrades to analyze them.
public class GradeBookTest2 {
    // main method begins program execution
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Prompt user for the number of students and exams
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        System.out.print("Enter the number of exams: ");
        int numExams = input.nextInt();
        
        // Create the gradesArray based on user input
        int[][] gradesArray = new int[numStudents][numExams];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numExams; j++) {
                System.out.printf("Enter grade for student %d, exam %d: ", i + 1, j + 1);
                gradesArray[i][j] = input.nextInt();
            }
        }
        
        // Create the GradeBook object and process grades
        GradeBook2 myGradeBook = new GradeBook2(
            "CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());
        myGradeBook.processGrades();
        input.close();
    } 
}*/




