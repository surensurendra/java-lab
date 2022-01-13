package surendra;

import java.util.Scanner;

public class Que19 {
	public static void main(String[]args) {
	//WAP sum of odd number n1 to n2
     Scanner input=new Scanner(System.in);
     System.out.println("Enter n1;");
     int n1=input.nextInt();
     System.out.println("Eneter n2:");
     int n2=input.nextInt();
     System.out.println("sum of odd n1 and n2 is:");
     int i;
     int sum=0;
     for(i=n1;i<n2;i++) {
    	 if(i%2!=0)
    		 sum=sum+i;
     }
     System.out.println(sum);
	}
}
