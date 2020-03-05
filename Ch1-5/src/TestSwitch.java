  
import java.util.Scanner;

public class TestSwitch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a date: ");
    int year = input.nextInt();
    String Daystring = null;   //???
    
    switch (year) {
      case 1: Daystring= "monday"; break;
      case 2: Daystring = "tuesday"; break;

      default: System.out.println("Error!");
      	System.exit(1);

    }
    System.out.print(Daystring);
  }
}