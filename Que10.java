package surendra;

import java.util.Scanner;

public class Que10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // WAP to print odd num between n1 to n2.
		Scanner input = new Scanner(System.in);
		System.out.println ("enter a first number:");
		int n1 = input.nextInt();
		System.out.println("Enter a second number:");
		int n2 = input.nextInt();
		int i;
		System.out.println("odd number between n1 and n2 is :");
		for(i=n1;i<n2;i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
			
		}
		
	}

}
