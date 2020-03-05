/*2. Write a program and use a while loop to find the smallest integer n such that n2 is greater than
12000*/

public class HW2_2 {
	public static void main(String[] args) {
		int Switch = 0;
		int Answer = 0;
		int i = 1;
		// we can use math.pow 
		while (i < 1000000000) {
		//for (int i=1; i < 10000000; i++) {
			if((i*2)>12000) Switch +=1;
			if (Switch == 1) Answer = i;
			i++;
}
		System.out.print(Answer);
}
}
