package surendra;

import java.util.Scanner;

public class Que23 {

	public static void main(String[] args) {
		// WAP to print sum of array element
		Scanner input = new Scanner(System.in);
		int[] num;
		num = new int[10];
		int i, sum =0;
		System.out.println("Enter 10 numbers:");
		 for(i=0;i<10;i++) {
		num[i] = input.nextInt();

	 }
		 System.out.println("Array elements:\n");
		 for(i=0;i<10;i++) {
			System.out.println( num[i]);
			 sum=sum+num[i];
		 }
		 System.out.println("Sum of the given array element is" +sum);
	}
}
