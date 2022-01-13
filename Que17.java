package surendra;

import java.util.Scanner;

public class Que17 {
	public static void main(String[]args) {
		//  print sum of n1 to n2
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n1:");
		int n1=input.nextInt();
		System.out.println("Enter n2:");
		int n2 = input.nextInt();
		System.out.println("sum of n1 and n2 is:");
		int i;
		int sum=0;
		for(i=n1;i<=n2;i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		
		
		
	}

}
