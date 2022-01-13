package surendra;

import java.util.Scanner;

public class Que14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//prime number n1 to n2
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		for(number=n1; number<=n2; number++)
		{
		int count=0;
		for(int i=2; i<=number/2; i++)
		{
		if(number%i==0)
		{
		count++;
		break;
		}
		}
		if(count == 0 && number != 1)
		System.out.print(number + "\t");
		}
		}
		}