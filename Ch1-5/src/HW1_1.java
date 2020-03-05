/*Q1
/Write a program that reads an integer between 1 and
12 from keyboard and display the English month names January, February ....  December 
for the numbers 1, 2,.....,12, accordingly(Use Switch Statement).*/
import java.util.Scanner;
public class HW1_1 {
	 public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);		    
		    System.out.print("Enter a month(1-12): ");
		    int month = input.nextInt();
		    String Daystring = null;   	    
		    switch (month) {
		      case 1: Daystring= "January"; break;
		      case 2: Daystring = "February"; break;
		      case 3: Daystring = "March"; break;
		      case 4: Daystring = "April"; break;
		      case 5: Daystring = "May"; break;
		      case 6: Daystring = "June"; break;
		      case 7: Daystring = "July"; break;
		      case 8: Daystring = "August"; break;
		      case 9: Daystring = "September"; break;    
		      case 10: Daystring = "October"; break;    
		      case 11: Daystring = "November"; break;    
		      case 12: Daystring = "December"; break;    
		      default: System.out.println("Error!");
		      	System.exit(1);
		    }
		    System.out.print(Daystring);
		  }
}

