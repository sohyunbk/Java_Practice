import java.util.Scanner;
/*Q4
Read a floating-point number from keyboard and find number of digits before point  
Hint: Convert Numbers to String because you need to operate on the value in its string form. 
Example:
int i; 
Concatenate "i" with an empty string; conversion is handled for you.
String s1 = "" + i;*/

public class HW1_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Range of possible number in negative number: from -1.7976931348623157E+308 to -4.9E-324");
		System.out.println("Range of possible number in positive number: from 4.9E-324 to 1.7976931348623157E+308");
		System.out.print("Enter floating-point number: ");
		double number = input.nextDouble() ;
		String s1 = ""+number;
		//System.out.println(number);
		System.out.print("The number of digits before point: ");		
		String length = null;
		Double number_check = new Double(number);
		if (number != number_check.intValue()) {
		if (number <=-1) { 
			if (s1.indexOf("E") >0) {
				length = s1.substring(s1.indexOf("E")+1,s1.length());
				int ilength = Integer.parseInt(length)+1;
				System.out.println(ilength);
			}
			else
				System.out.println(s1.indexOf(".")-1);
		}
		else if (-1 <number & number <1)
	    	System.out.println("0");
		
		else if (number >= 1) { 
			if (s1.indexOf("E") >0) {
				length = s1.substring(s1.indexOf("E")+1,s1.length());
				int ilength = Integer.parseInt(length)+1;
				System.out.println(ilength);
			}
			else
				System.out.println(s1.indexOf("."));
		}
	}	else {
		if (number <0) { 
		 System.out.println(s1.indexOf(".")-1 +"   but it is integer");}
	    else  { 
		 System.out.println(s1.indexOf(".") +"   but it is integer");}

	}}
	}

