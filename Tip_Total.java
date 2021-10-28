import java.util.Scanner;

public class assignment1 {

	public static void main(String[] args) {
		System.out.print("How much was your Entree?= ");
		Scanner input = new Scanner(System.in);
		
		double entree = input.nextDouble();
		
		System.out.print("How much was your drink?= ");
		double drink = input.nextDouble();
		
		System.out.print("How much was your desert?= ");
		
		double desert = input.nextDouble();
		
		
		double total = entree + drink + desert;
		
		double total2 = (total * .06) + total;
		System.out.println("Your total is: " +total2);
		
		System.out.println("Do you wish to tip? ");
		
		double total3 = (total2 * .10) + total2;
		
		System.out.println(" Total with 10%: " + total3 );
		

		double total4 = (total2 * .15) + total2;
		
		System.out.println(" Total with 15%: " + total4 );
		

		double total5 = (total2 * .20) + total2;
		
		System.out.println(" Total with 20%: " + total5 );
		
		
		
		
		
 }







}

