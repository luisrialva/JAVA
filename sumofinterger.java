import java.util.Scanner;

public class sumofinterger {

	public static void main(String[] args) {
	
		
	
		int data;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		do {
		System.out.print("Enter an interger(The input ends if it is 0): ");
		
		data = input.nextInt();
		
		sum += data;}
		
		while(data != 0);
		
		System.out.print("The sum is: " + sum);
		
		
		
		

	}

}
