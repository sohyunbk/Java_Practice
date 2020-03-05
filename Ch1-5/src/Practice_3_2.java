import java.util.Scanner;

// Write the method that counts the number of letters in a string using the following heather input:1A5

public class Practice_3_2 { 
	
		public static int coutLetter(String s) { 
			int k = 0;
			int i = 0;
			while (i < s.length()) { // for 문으로 짜보기
				  //System.out.println(i);
				if (Character.isLetter(s.charAt(i))) {
					k++;}
				i++;}
			return k;
		}


		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter String: ");
			String s2 = input.nextLine();
			System.out.println(coutLetter(s2));
					} 
	}


/*
for (int i=0; i < length; i++)
*/