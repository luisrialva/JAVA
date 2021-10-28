import java.util.Scanner;

public class class1problem1 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		int num1 = (int)(Math.random()* 101);
		System.out.print("I have a magic number between 0 and 100: Can you guess it? ");
		int guess;
		
		do {
		
			System.out.print("In enter your guess: ");
		 guess = input.nextInt();
			if(guess == num1)
			System.out.print("Yes, the number is "+ num1);
			else if (guess > num1)
				System.out.print("Your guess is to high. ");
			else
				System.out.print("Your guess is to low. ");
		}while (guess != num1 && count < 6);
		if (guess != num1);
		System.out.println("\nTries exhausted");
	
	
		 
		 
		
		
			
	}

}
