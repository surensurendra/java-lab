package surendra;
import java.util.Scanner;
public class Que31 {
	public static void main(String[]args) {
		// To delete a number form the array
		Scanner input = new Scanner(System.in);
		int[] arr = {2,5,4,7,9,6};

		System.out.println("Given array number is:\n");
		for(int i = 0; i < arr.length; i++){
		System.out.print(arr[i]+" ");
		}
		System.out.print("\nEnter Element you want  deleted : ");
		int element = input.nextInt();

		for(int i = 0; i < arr.length; i++){
		if(arr[i] == element){
		// shifting elements
		for(int j = i; j < arr.length - 1; j++){
		arr[j] = arr[j+1];
		}
		break;
		}
		}

		System.out.println("\nAfter removing element " + element + "\n");
		for(int i = 0; i < arr.length-1; i++){
		System.out.print(arr[i]+" ");
		}
		}
		
	}


