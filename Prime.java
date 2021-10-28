import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner input = new Scanner (System.in);
		
		System.out.print("Enter the a number: ");
		
		int N = input.nextInt();
		
		boolean prime = true; 
 
			for (int i =2; i<N; i++)
			{
			if (N%i==0) {
	       
				prime = false;
						break;}}
			if (prime)	System.out.print("It is a prime number");	
			else System.out.print("It is not a prime number");
			}
	}


