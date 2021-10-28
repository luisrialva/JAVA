import java.util.Scanner;

public class day1 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter the first city:");
		
		String city1 = input.nextLine();
		
		System.out.print("Enter the secound city: ");
		
		String city2 = input.nextLine();
		
		System.out.print("Enter the third city: ");
		
		String city3 = input.nextLine();
		
		if (city1.compareTo(city2) <0)
			
			System.out.print("The cities in alphabet order are " + city1 + " " + city2 + "" + city3);
		
		else 
			
		System.out.println("The cities in alphabetical order are "+ city3 + " "+ city2 + " " + city1);
		
	
		
	}

}
