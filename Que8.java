package surendra;

import java.util.Scanner;

public class Que8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//program to print n1 to n2.
		Scanner S = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = S.nextInt();
		System.out.println("Enter second number:");
		int n2 =S.nextInt();
		int i;
		System.out.println("number between first and second number is:");
		for(i=n1;i<n2;i++) {
			System.out.println(i);
		}
		

	}

}
