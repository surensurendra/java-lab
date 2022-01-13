package surendra;

public class Que4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if statement
		
		/*int numb=20;
		if(numb !=30) {
			System.out.println("true input.");
		}
		*/
		//if else statement.
		
		/*int age=50;
		if(age<=60) {
			System.out.println("adult man");
		}
		else {
			System.out.println("young man");
		}
         */
		
		//ladder if statement
		/*int choice = 3;
		if(choice == 3)
		System.out.println("you are wrong");
		else if(choice == 2)
		System.out.println("you are trying your best");
		else if(choice == 3)
		System.out.println("you have achive your gool");
		else if(choice == 4)
		System.out.println("you are out of you gool");
		else if(choice == 5)
		System.out.println("sorry! better luck for nest time");
		
		else
		System.out.println("dont try this many time! it may loose your data");
		
		*/
		//nested if statement
		
		int num = 8;
		if(num > 0)
		{
		if(num % 2 == 0)
		System.out.println(num + " is positive even number");
		else
		System.out.println(num + " is positive odd number");
		}
		else
		{
		if(num % 2 == 0)
		System.out.println(num + " is negative even number");
		else
		System.out.println(num + " is negative odd number");
		}
	}

}
