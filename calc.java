import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {

	public static void main(String[] args) {

			Scanner in = new Scanner(System.in);

			String option;

			

			try{

			
			System.out.print("Enter first number: ");

			int first = in.nextInt();

			System.out.print("Enter the operator:");

			String operator = in.next();

			System.out.print("Enter second number:");

			int second = in.nextInt();

			double result = 0;

			if(operator.equals("+")){

			result = first+second;

			}

			else if(operator.equals("-")){

			result = first-second;

			}

			else if(operator.equals("*")){

			result = first*second;

			}

			else if(operator.equals("/")){

			result = first/second;

			}

			String resultFormatted = String.format("%.2f",result);

			System.out.println("Result for "+first+operator+second+" = "+result);

			}

			catch(InputMismatchException e){

			System.err.println("Non numeric value entered");

			System.exit(0);
			}


			}

			
			}

			
		

				