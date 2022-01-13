package surendra;

public class Que20 {
	public static void main(String[]args) {
		//WAP to print sum of even number from 1 to 100
		int i=1;
		int sum=0;
		for(i=1;i<=100;i++) {
			if(i%2==0)
				sum=sum+i;
		}
		System.out.println("The sum of even number is:" +sum);
	}

}
