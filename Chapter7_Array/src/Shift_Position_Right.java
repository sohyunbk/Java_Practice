
public class Shift_Position_Right {
	public static void main(String[] args) {
	double[] myList = {2.3,5.4,5,8};
	double[] Change = Shift_Right(myList);
	for(int i =0; i< Change.length; i++) System.out.println(Change[i]);
	}
	// {8,2.3, 5.4, 5}
	public static double[] Shift_Right(double array[]) { //public static double Max_Sohyun(double[] List)  요것두 가능!!
	double temp = array[0];
	double[] NewList = new double[array.length];
	//double[] myList = new double[4];

	for (int i = 0; i < array.length-1; i++) {
		//System.out.println(array[i]);
		NewList[i+1] = array[i];}
	//System.out.println(array[array.length-1]);
    NewList[0] = array[array.length-1];
	return NewList;
	}	}
