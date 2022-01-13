package surendra;

public class Que6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested Switch statement.
		
		int i = 0;
		int j = i;
		switch(i) {
		case 0:
			switch(j) {
			case 0 :
				System.out.println("i is 0 , j is 0");
				break;
			case 1:
				System.out.println("i is 0 ,j is 1");
				break;
				default:
				System.out.println("nested default case!");
				
				
			}
			break;
			default:
				System.out.println("No matching case found");
			
		}
		
	}

}
