package oop;
	// Fig. 7.12: EnhancedForTest.java
	// Using the enhanced for statement to total integers in an array.

	public class EnhancedForTest {
	   public static void main(String[] args) {
	      int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
	      int total = 0;

	      // add each element's value to total
	      //for (int number : array) {  
	      for(int number=0;number<array.length;number++) {
	         total += array[number];                 
	      }                                   

	      System.out.printf("Total of array elements: %d%n", total);
	   } 
	} 

