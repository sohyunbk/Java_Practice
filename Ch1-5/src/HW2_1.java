import java.util.Scanner;

/*1. Write a program that displays all the numbers from 100 to 1000, ten per line, that are divisible
by 5 and 6.*/

public class HW2_1 {
	public static void main(String[] args) {
		int nLine = 0;
		for (int i=100; i < 1001; i++) {
		
			if(i%5==0&i%6==0) {
			System.out.print(i+" ");
			nLine+=1;
			if (nLine%10==0) System.out.print("\r");
		}
}
}}