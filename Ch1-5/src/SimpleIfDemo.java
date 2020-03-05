import java.util.*;

public class SimpleIfDemo {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Insert your code:");
    String s = input.nextLine();
    String S2 = input.next(); // Read the words until block (Space ) .
    
    
    //String E = "ABCD";
    //System.out.println(E.charAt(0));
    
    //System.out.println(S);
    if (s.charAt(0) == 'M') 
    	System.out.println("Math");
    else if (s.charAt(0) == 'C')
    	System.out.println("Computer");
    else if (s.charAt(0) == 'I')
    	System.out.println("Information Teaching");
    
    if (s.charAt(1) == '1')
    	System.out.println("Freshmen");
    else if (s.charAt(1)=='2')
    	System.out.println("Sophomore");
    else if (s.charAt(1)=='3')
    	System.out.println("Junior");
    else {
    	System.out.println("Error here!");
    	System.exit(2);
    }
    
    	
    
  }
}