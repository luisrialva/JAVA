import java.util.Scanner;

public class Credit {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		
		System.out.print("Enter credit limit: ");
		double CredL;
		CredL = input.nextDouble();
		
		System.out.print("Enter Current Balance: ");
		double Balance;
		Balance = input.nextDouble();
		
		double TotalA;
		TotalA = CredL - Balance ;
		System.out.print("Available balance: " + TotalA);
	}

	}


