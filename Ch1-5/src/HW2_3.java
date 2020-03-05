/*3. Write a program that finds square root the numbers from 0 to 20 and print it as a table as 
 * first column the number and second column square of the number.
 * Your output format willbe:  */

public class HW2_3 {
	public static void main(String[] args) {
		System.out.println("Number\tSquare");
		for (int i=0; i < 21; i++) {
		double Square = Math.sqrt(i);
		System.out.printf("%d\t%f\n",i,Square);}
		//System.out.printf("%d\t%.0f\n",i,Square);}	
	}
}
