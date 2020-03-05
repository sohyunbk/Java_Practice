import java.util.Scanner;

/*3. Write a program Read a letter A to F and print the numeric value for the grade. 
  A is 4, B is 3,C is 2, D is 1 and F is0
 */
public class HW1_3 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter a letter:");
		  String string = input.nextLine();
		  
		  if (string.equals("A")) 
		    	System.out.println("4");
		  else if (string.equals("B")) 
		    	System.out.println("3");
		  else if (string.equals("C")) 
		    	System.out.println("2");
		  else if (string.equals("D")) 
		    	System.out.println("1");
		  else if (string.equals("F")) 
		    	System.out.println("0");
		  else  System.out.println("Invalid Input");
		  
		  input.close();
		  
}
}
