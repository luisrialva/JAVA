import java.util.Scanner;

public class class1 {

	public static void main(String[] args) {
		
		System.out.print(" Enter number:");
		Scanner scan1 = new Scanner(System.in);
		int num = scan1.nextInt();
		
		if (num < 0)
			num = -1 * num; 
		System.out.println(" Absolute value: " + num);

	}

}
