package surendra;

import java.util.Scanner;

public class Que12 {
public static void main(String[]arg) {
	//WAP to print sum of odd number from n1 to n2.
	int n1, n2, sum = 0;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a first number:");
	 n1 = input.nextInt();
	 System.out.println("Enter a second numbet:");
	 n2 = input.nextInt();
	 int i;
	 System.out.println("The sum of odd number from n1 to n2 is");
	 for(i=n1;i<n2;i++) {
		 if(i%2==0)
			 sum = sum+1;
		 
	 }
	 System.out.println(sum);
	
	
	
}
}
