import java.util.Scanner;

//1) Enter a letter and determine if it is a vowel or not

public class BowelorNot {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.println("Enter a letter:");
		  String string = input.nextLine();
		  Character letter = string.toLowerCase().charAt(0);

		  if (Character.isLetter(letter)) {
		   if (letter == ('a'|'e'|'i'|'o'|'u')) 
		    	System.out.println("Vowel");
		    else System.out.println("Not vowel");
		    	
		  }
		  else {
			  System.out.println("Invalid Input");
		  }
		  input.close();
		  
}
}
