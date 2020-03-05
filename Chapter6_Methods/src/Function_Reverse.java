import java.util.Scanner;

public class Function_Reverse {
	
		public static void display(int i) { // 여기까지는 맞음
			while (i!=0) {
				int re = i%10;
				 System.out.print(re); 
				 //System.out.print(i);
				 i = i/10;
			}
		}
	
		public static void main(String[] args) {

			Scanner input = new Scanner(System.in);
			System.out.println("Enter Integer: ");
			int number = input.nextInt();
			display(number);
					} 
	}


