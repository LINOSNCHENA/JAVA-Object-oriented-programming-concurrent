package bankfocus;
public class SecondSmallestx2{  
	public static void main(String[] args) {
		int arr[] = { 2012, 1984, 2009, 2014 };
		int largest = arr[0];
		int secondLargest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {	System.out.print(arr[i]+"\t");		}
		for (int i = 0; i < arr.length; i++) {
 
			if (arr[i] > largest) {
				secondLargest = largest;  //Initial guess move to second place
				largest = arr[i];          // trial becomes number one
 
			} else if (arr[i] > secondLargest) { // Second competition
				secondLargest = arr[i];     //guess is further demoted to third!
 
			}
		}
        System.out.print("\nFirst largest number is:" + largest);
		System.out.println("\nSecond largest number is:" + secondLargest);
		System.out.println("=================================================");
 
	}
}