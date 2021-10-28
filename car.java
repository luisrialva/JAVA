import java.util.Scanner;

public class car {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter number of miles driven: ");
		double carM;
		carM = input.nextDouble();
		
		System.out.print("Enter number of gallons used: ");
		double gas;
		gas = input.nextDouble();
		
		double GUG;
		GUG = carM / gas ;
		System.out.print("Average Miles per Gallon: " + GUG);
	}

}
