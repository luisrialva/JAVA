import java.util.Scanner;

public class Day2 {

	public static void main(String[] args) {
		System.out.print("Enter side of the hexagon: ");
		Scanner input = new Scanner (System.in);
		
	    double s = input.nextDouble();
	    
	    double area =  (6 + Math.pow(s, 2))/ (4 *  Math.tan(Math.PI / 6));
	    
	    System.out.print("The area of the hexagon is: " + area);
		
		

	}

}
