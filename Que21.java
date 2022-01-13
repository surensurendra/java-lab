package surendra;

import java.util.Scanner;

public class Que21 {

	public static void main(String[] args) {
		//WAP to print even number from n1 to n2
		Scanner input=new Scanner(System.in);
		System.out.println("Enere n1 :");
		int n1 = input.nextInt();
		System.out.println("Eneter n2:");
		int n2 = input.nextInt();
		int sum=0;
		for(int i=n1;i<=n2;i++) {
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println("The sum of even number from n1 to n2 is:" +sum);
         
	}

}
