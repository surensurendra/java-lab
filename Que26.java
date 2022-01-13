package surendra;

import java.util.Scanner;

public class Que26 {
	public static void main(String[]args) {
		//Write a progarm to print greatest number of array element.
		int i, large, size;
		int arr[]=new int[5];
		Scanner input = new Scanner(System.in);
		System.out.println("enter array size");
		 size = input.nextInt();
		 System.out.println("Enter array element:");
		 for(i=0;i<size;i++) {
			 arr[i] = input.nextInt();
			 
		 }
		 System.out.println("searching for largest number...\n\n");
		 large = arr[0];
		 for(i=0;i<size;i++) {
			 if(large<arr[i]) {
				 large = arr[i];
			 }
		 }
		 System.out.println("largest number:" +large);
		 
		
	}

}
