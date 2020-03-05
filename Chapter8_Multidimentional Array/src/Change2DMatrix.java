import java.util.*;

public class Change2DMatrix {
	public static void main(String[] args) {
		/*int[][]x=new int[3][4];
		//System.out.println(x.length); // x.length means the number of row 
		// if you know the number of column you can use x[0].length
		int [][]matrix = new int[10][10];
		matrix[0][0] = 3;
		for (int i=0; i < matrix.length;i++)
			for (int j =0; j < matrix[i].length;j++)
				matrix[i][j] = (int)(Math.random()*1000);
		//System.out.println(matrix);
	*/
	int[][]m = {{1,2,3},{4,5,6}};
	for(int column=0;column < m[0].length;column++) {
	for (int row=0;row<m.length;row++) {
			System.out.print(m[row][column]+ " ");
		} System.out.println();
	}
	
	
	for (int column = 0; column < m[0].length; column++) {
		  int total = 0;
		  for (int row = 0; row < m.length; row++)
		    total += m[row][column];
		  System.out.println("Sum for column " + column + " is " 
		    + total);
		}

	
	
	
	}
}
