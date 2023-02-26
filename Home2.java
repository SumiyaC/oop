package oop;
import java.util.Scanner;
public class Home2 {
	public static void main(String [] args) {
	Scanner input=new Scanner(System.in);
	

	System.out.printf("Enter the length of array");
	int s=input.nextInt();
	int[] array=new int[s];
	for(int i=0;i<s;i++) {
		System.out.println("Enter your desired number:");
		array[i]=input.nextInt();
	}
	//```````
	for (int i=0;i<array.length;i++) {
		System.out.println(array[i]);
	
	}
	}
}
