// Write a program to generate 500000 random numbers less than 100 using class Random, find the time to generate 
// numbers numbers using System.currentTimeMillis(), print the time then generate 
//5000000 random numbers less than 100 using math.random() and find time to generate numbers and print time
//long start = System.currentTImeMillis);
//long end = System.currentTImeMillis()
//S.o.p(end-start)
import java.util.Random;


public class Lab2_RandomNumber {
	public static void main(String[] args) {
		Random random = new Random(10);
		long start = System.currentTimeMillis();
		for(int i =0;i < 500000;i++) 
		random.nextInt(100);
		long end = System.currentTimeMillis();
		// Calculate time taken
		System.out.println("Time taken by Random Class "+((end-start))+" miliseconds");
		
		long start2 = System.currentTimeMillis();
		int random2;
		for(int i=0;i<5000000;i++)
		random2 = (int)(Math.random()*100);
		long end2 =System.currentTimeMillis();
		//Calcualte time taken
		System.out.println("Time taken by Random Class "+((end2-start2))+" miliseconds");

	}
}
