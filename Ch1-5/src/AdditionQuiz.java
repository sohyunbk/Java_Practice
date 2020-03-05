import java.util.Scanner;
import java.util.Random;
//import java.util.*;


public class AdditionQuiz {
  public static void main(String[] args) {
    
	  Random rand = new Random();
	  int number3 = rand.nextInt(100); // Generating a random number between 0 to 99
	  //System.out.println(number0);
	  int number4= rand.nextInt(100);
	  double number5 = rand.nextDouble(); // 0 < X < 1  you can + 50 like that
	  System.out.println(Math.random());  // same with above. but does not need to make object
	  
	  
	  System.out.println(number5);
	  
	  
	  
	  
	  int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis() / 10 % 10);

    // Create a Scanner
    Scanner input = new Scanner(System.in);

    System.out.print(
      "What is " + number3 + " + " + number4 + "? ");

    int answer = input.nextInt();

    System.out.println(
      number3 + " + " + number4 + " = " + answer + " is " +
      (number3 + number4 == answer));
  }
}