
public class Array_Max_Method {
	public static void main(String[] args) {
	double[] myList = {2.3,5.4,5,8};
	System.out.print(Max_Sohyun(myList));
	}
	
	public static double Max_Sohyun(double array[]) { //public static double Max_Sohyun(double[] List)  요것두 가능!!
	double max = array[0];
	for (int i = 1; i < array.length; i++) {
	  if (array[i] > max) max = array[i];}
	return max;
	}

	//for(int i =0; i< myList.length; i++) System.out.println(myList[i]);
	}

