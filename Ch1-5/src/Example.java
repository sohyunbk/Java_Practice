import java.util.Scanner;

public class Example {
  public static void main(String[] args) {

    int year = 1;
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