import java.util.Scanner;

public class class1day1problem2 {

	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		System.out.print("Enter a number:"); 
		int n = input.nextInt();
		int i =1;
		int sum= 0;		
		while(i<=n) {
		sum = sum + i;
		i++;
		}
		System.out.println("sum = "+sum);
	}
	}


