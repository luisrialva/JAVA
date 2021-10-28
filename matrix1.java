
public class matrix1 {

	public static void main(String[] args) {
		
		int[][] Matrix= new int[4][3];
		
		System.out.println("the row length is "+ Matrix.length);
		System.out.println("the column length is "+ Matrix[0].length);
		
		for(int i=0;i<Matrix.length;i++)
			 for(int j=0; j<Matrix[i].length;j++)
					Matrix[i][j]=(int) (Math.random()*1000);
		
		for(int i=0;i<Matrix.length;i++)
			 for(int j=0;j<Matrix[0].length;j++)
				 System.out.println(Matrix[i][j]);
			
	}

}
