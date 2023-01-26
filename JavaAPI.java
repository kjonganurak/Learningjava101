import java.util.*;

public class JavaAPI {
	public static void main(String[] args) {
		double[] gpaS = {3.7,3.4,3.6,3.9,3.5};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a value");
		double newGPA = scanner.nextDouble();
		System.out.print("Given GPAs are [");
		for (int i = 0;i < gpaS.length; i++) {
			if (i < gpaS.length - 1) {
				System.out.print(gpaS[i] + " ,");
			}
			else {
				System.out.println(gpaS[i] + "]");
			}
		}	
		Arrays.sort(gpaS);
		System.out.print("Sorted GPAs are [");
		for (int i = 0;i < gpaS.length; i++) {
			if (i < gpaS.length - 1) {
				System.out.print(gpaS[i] + " ,");
			}
			else {
				System.out.println(gpaS[i] + "]");
			}
		}
		int index ;
		index = Arrays.binarySearch(gpaS , newGPA);
		if ( index >= 0) {
			System.out.println(newGPA + " is index " + index);
		}
		else{
			System.out.println(newGPA + " is not found");
		}
		scanner.close();
	}
}