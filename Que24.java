package surendra;

import java.util.Scanner;

public class Que24 {

	public static void main(String[] args) {
		// WAP to print the average of  array element
		int sum = 0;
		int[] arrayVar = {2,3,5,8,9};
		for(int a: arrayVar)
		{
		sum += a;
		}
		float average = sum / 4;
		System.out.println("Average of array elements is: " + average);
		
		

	}

}
