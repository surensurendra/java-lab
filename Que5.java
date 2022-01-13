package surendra;
import java.util.Scanner;
public class Que5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number between(1-7):");
		int days = input.nextInt();
		switch(days) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("Thrusday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("invalid number");
		}


		
	}

}
