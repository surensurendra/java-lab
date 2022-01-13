package surendra;

import java.util.Scanner;

public class Que30 {

	public static void main(String[] args) {
		// program to search specific number within array and print the number of repetition
		int count=0, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		n = input.nextInt();
		int arrayVar[] = {1,5,6,4,7,8,2,1,4,5,6,11};
		for(int i = 0; i < arrayVar.length; i++){
		if(n == arrayVar[i])
		count++;
		}
		if(count!=0)
		System.out.println(n + " is in array and repeated " + count + " times.");
		else
		System.out.println(n + " is not in array.");
		}
		}
