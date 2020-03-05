import java.util.Scanner;

//10 2 5 1 4 5 7 6 7 --> 10 number --> average?

public class Practice_3_3 {
/*
	public static int average(int s, int Sum2) { 
		Sum2 += s;
		System.out.print(Sum2);
		return Sum2;
	}*/

	public static void main(String[] args) {
		System.out.print("Enter the number you are gonna use: ");
		Scanner input = new Scanner(System.in);
		int s2 = input.nextInt();
		float Sum = 0;

		for (int i1=0; i1 < s2; i1++) {
		System.out.print("Enter number: ");
		Scanner input2 = new Scanner(System.in);
		int s3 = input2.nextInt();
		Sum += s3;
		//average(s3,Sum);
		//System.out.println(Total);
		}
		System.out.println(Sum/s2);
				} 
}
