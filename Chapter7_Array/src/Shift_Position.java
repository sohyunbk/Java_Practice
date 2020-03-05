
public class Shift_Position {
	public static void main(String[] args) {
	double[] myList = {2.3,5.4,5,8};
	double[] Change = Shift_Sohyun(myList);
	for(int i =0; i< Change.length; i++) System.out.println(Change[i]);
	}
	
	public static double[] Shift_Sohyun(double array[]) { //public static double Max_Sohyun(double[] List)  요것두 가능!!
	double temp = array[0];
	for (int i = 1; i < array.length; i++) {
	  array[i-1] = array[i];}
	array[array.length -1] = temp;
	return array;
	}	}

