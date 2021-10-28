import java.util.Scanner;

public class Q2 {
	 public static boolean equals(int[][] M1, int[][] M2)
	   {
	       int count = 0;
	      
	       for(int i = 0; i < 3; i++)
	       {
	           for(int j = 0; j < 3; j++)
	           {
	               if(M1[i][j] == M2[i][j]) 
	               {
	                   count++;
	               }
	               else
	               {
	                   break;
	               }
	           }
	       }
	      
	       if(count == 9)
	       {
	           return true; 
	       }
	       else
	       {
	           return false; 
	       }
	      
	   }
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	       int a[][] = new int[3][3];
	       int b[][] = new int[3][3];
	       System.out.println("Enter list 1: ");
	       for(int i = 0; i < 3; i++)
	       {
	           for(int j = 0; j < 3; j++)
	           {
	               a[i][j] = s.nextInt(); 
	           }
	       }
	      
	       System.out.println("Enter list 2: ");
	       for(int i = 0; i < 3; i++)
	       {
	           for(int j = 0; j < 3; j++)
	           {
	               b[i][j] = s.nextInt(); 
	           }
	       }
	      
	       boolean result = equals(a, b); 
	       if(result)
	       {
	           System.out.println("The two arrays are strictly identical");
	       }
	       else
	       {
	           System.out.println("The two arrays are not strictly identical");
	       }
	}

}
