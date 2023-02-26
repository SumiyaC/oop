package oop;

public class GradeBook1New {
	//package oop;

	//public class GradeBook1 {
	    private String courseName;
	    private int[] grades;
	    
	    public GradeBook1New(String courseName, int[] grades) {
	        this.courseName = courseName;
	    try {
	        this.grades = grades;
	    }
	    catch(NullPointerException e){
	    	System.err.println("Error:" +e.getMessage());
	    }
	    }
	    
	    
	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }
	    
	    public String getCourseName() {
	        return courseName;
	    }
	    
	    public void processGrades() {
	        outputGrades();

	        try {
	            System.out.printf("%nClass average is %.2f%n", getAverage());
	        } catch (ArithmeticException e) {
	            System.out.println("Error calculating average: " + e.getMessage());
	        }

	        try {
	            System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
	                getMinimum(), getMaximum());
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error finding minimum or maximum grade: " + e.getMessage());
	        }

	        try {
	            outputBarChart();
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error creating bar chart: " + e.getMessage());
	        }
	    }
	    
	    public int getMinimum() {
	        if (grades == null || grades.length == 0) {
	            throw new NullPointerException("Grades array is null or empty");
	        }
	        
	        int lowGrade = grades[0];

	        for (int grade : grades) {
	            if (grade < lowGrade) {
	                lowGrade = grade;
	            }
	        }

	        return lowGrade;
	    }
	    
	    public int getMaximum() {
	        if (grades == null || grades.length == 0) {
	            throw new NullPointerException("Grades array is null or empty");
	        }
	        
	        int highGrade = grades[0];

	        for (int grade : grades) {
	            if (grade > highGrade) {
	                highGrade = grade;
	            }
	        }

	        return highGrade;
	    }
	    
	    public double getAverage() {
	        if (grades == null || grades.length == 0) {
	            throw new NullPointerException("Grades array is null or empty");
	        }
	        
	        int total = 0;

	        for (int grade : grades) {
	            total += grade;
	        }

	        return (double) total / grades.length;
	    }
	    
	    public void outputBarChart() {
	        if (grades == null || grades.length == 0) {
	            throw new NullPointerException("Grades array is null or empty");
	        }
	        
	        int[] frequency = new int[11];

	        for (int grade : grades) {
	            if (grade < 0 || grade > 100) {
	                throw new ArrayIndexOutOfBoundsException("Invalid grade: " + grade);
	            }
	            
	            ++frequency[grade / 10];
	        }

	        for (int count = 0; count < frequency.length; count++) {
	            if (count == 10) {
	                System.out.printf("%5d: ", 100);
	            } else {
	                System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
	            }

	            for (int stars = 0; stars < frequency[count]; stars++) {
	                System.out.print("*");
	            }

	            System.out.println();
	        }
	    }
	    
	    public void outputGrades() {
	        if (grades == null || grades.length == 0) {
	            throw new NullPointerException("Grades array is null or empty");
	        }
	        
	        System.out.printf("The grades are:%n%n");

	        for (int student = 0; student < grades.length; student++) {
		         System.out.printf("Student %2d: %3d%n",                 
		            student + 1, grades[student]);                       
		      } 

}
