package surendra;

public class Que29 {

	public static void main(String[] args) {
		// To print second smallest number of array element
		int arr[]= {12,3,33,4,5,33,6};
		for(int i=0;i<7;i++) {
			for(int j=i+1;j<7;j++) {
				if(arr[i]>arr[j]) {
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=  temp;
					
							
				}
			}
		}
		
		System.out.println(" second Smallest element is:" +arr[1]);

	}

}
