//2. Read two strings from keyboard and check ift the second string is a substring of the first string
/* */
import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter the first string:");
	    String s1 = input.nextLine();
	    System.out.print("Enter the second string:");
	    String s2 = input.next(); // Read the words until block (Space ) .
		
		System.out.println(s1.indexOf(s2));
		// !=-1 이면...
		String[] words = s2.split(" ");
		int k = 0;
		for (String wo : words ){
			if (s1.indexOf(wo)!=0) {
				k +=1;
				System.out.println(wo);
				}
		}

		// 띄어쓰기 어케 무시할지..
	}
}
