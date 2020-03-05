import java.util.*;

public class Paper_Practice {
	public static void main(String[] args) {
	    //int[][]r = new int[2];
	    //int[] x = new int[];
	    int[][]y = new int[3][];
	    int[][]z = {{1,2}};
	    //System.out.println(Arrays.toString(y));
	    //int[][]m = {{1,2},{2,3}};
	    int[][]n = {{1,2},{2,3},};
	    //System.out.println(Arrays.deepToString(n));
	    double[] r = new double[100];
	    
	    //for (int i =0;i<r.length;i++)
	    //	r[i] = Math.random*100;
	    
	    
		int[][] m = new int[5][6];
		int[]x = {1,2};
		m[0]=x;
		
		//System.out.println(m.toString());
		
		//System.out.println(Arrays.deepToString(m));
		System.out.println(m[0][3]);
		//System.out.println(m[0].length);
		for (int row=0;row<m.length;row++) {
		for(int column=0;column < m[row].length;column++) {
					System.out.print(m[row][column]+ " ");
				} System.out.println();
			}
		//System.out.println(array[0][1]);

	}}
