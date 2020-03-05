import java.util.*;

// Write a method to add two 2D double matrices. 
//The header of the method is: public static double[] [] add Matrix(double[][]m1, double[][]m2)
//Matrices are 3*3 and read numbers from Keyboard

public class Lab1_AddMatrices {
	public static void main(String[] args) {
		double [][]m1 = new  double [3][3];
		double [][]m2 = new double [3][3];
		System.out.print("Enter 9 numbers (3*3):");

		Scanner input = new Scanner(System.in);
		//double k = input.nextDouble();

		for (int row=0;row<m1.length;row++) {
			for(int column=0;column < m1[row].length;column++) {
				//double k = input.nextDouble();
				double k = input.nextDouble();
				m1[row][column] =k;
			}}
		System.out.print("Enter 9 numbers (3*3):");
		for (int row=0;row<m1.length;row++) {
			for(int column=0;column < m1[row].length;column++) {
				double k = input.nextDouble();
				m2[row][column] =k;
			}}
				
		

		int nRow_1 = m1.length;
		int nColumn_1 = m1[0].length;

		int nRow_2 = m2.length;
		int nColumn_2 = m2[0].length;

	    if (nRow_1 == nColumn_1 & nRow_2 == nColumn_2) {
	    double [][] SumMatrix = 	AddMatrix(m1, m2);
		for (int row=0;row<SumMatrix.length;row++) {
		for(int column=0;column < SumMatrix[row].length;column++) {
				    	
			       System.out.print(SumMatrix[row][column]+ " ");
				} System.out.println();
			} 
	    }
	    else System.out.println("The number of column and row do not match");
	    }

	public static double[][] AddMatrix(double[][]m1, double[][]m2) {
		int nRow_1 = m1.length;
		int nColumn_1 = m1[0].length;

		double [][]k = new double[nRow_1][nColumn_1];
		
		for (int row=0;row<m1.length;row++) {
		for(int column=0;column < m1[row].length;column++) {
				    	k[row][column] = m1[row][column]+m2[row][column];
			      //System.out.print(m[row][column]+ " ");
				} 	} return k;
		
	}
}
