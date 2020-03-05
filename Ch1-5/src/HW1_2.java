/*Q2
Assume that a vehicle plate number consists of three uppercase letters followed by four digits.
 Write a program to generate a plate number.*/
import java.util.Random;

public class HW1_2 {
	public static void main(String[] args) {
		Random ran = new Random();
		int i1 = ran.nextInt(10);
		int i2 = ran.nextInt(10);
		int i3 = ran.nextInt(10);
		int i4 = ran.nextInt(10);
		String ch1 = Character.toString((char) ((Math.random() * 26) + 65));
		String ch2 = Character.toString((char) ((Math.random() * 26) + 65));
		String ch3 = Character.toString((char) ((Math.random() * 26) + 65));
		System.out.println(ch1+ch2+ch3+i1+i2+i3+i4);
	}
}
