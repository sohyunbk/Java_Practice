
import java.util.Scanner;

public class Function_Radius {
	  /** Main method 
	 * @return */
	  public static double Radius(double radius) {
		    double PI = 3.14;
		    double circleArea = radius*radius*PI;
		    return circleArea; // Return result
	  }

			public static void main(String[] args) {

				Scanner input = new Scanner(System.in);
				System.out.print("Enter radius: ");
				Double number = input.nextDouble();
				System.out.print(Radius(number));
		} }
	

