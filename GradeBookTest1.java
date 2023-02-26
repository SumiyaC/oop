package oop;
//import java.util.Scanner;
public class GradeBookTest1 {
	//use try catch
	//throws exception but in main function i should catch
	// Fig. 7.15: GradeBookTest.java
	// GradeBookTest creates a GradeBook object using an array of grades, 
	// then invokes method processGrades to analyze them.
	//public class GradeBookTest {
	   public static void main(String[] args) {
	      // array of student grades  
		   //Scanner input = new Scanner(System.in);
		   //System.out.print("Enter the number of total values you want to give: ");
		   //int number = input.nextInt();

	      int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87,110,-5,150};
	      
	      GradeBook1 myGradeBook = new GradeBook1(
	         "CS101 Introduction to Java Programming", gradesArray);
	      System.out.printf("Welcome to the grade book for%n%s%n%n", 
	         myGradeBook.getCourseName());
	      myGradeBook.processGrades();
	   } 
	} 



