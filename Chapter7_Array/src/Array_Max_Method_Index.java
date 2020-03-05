
public class Array_Max_Method_Index {
	public static void main(String[] args) {
	double[] myList = {2.3,5.4,5,8,1};
	System.out.print(Min_Index(myList));
	}
	
	public static int Min_Index(double array[]) { //public static double Max_Sohyun(double[] List)  요것두 가능!!
	double min = array[0];
	int index = 0 ;
	for (int i = 1; i < array.length; i++) {
	  if (array[i] < min) {min = array[i];index=i;}}
	return index;
	}

	//for(int i =0; i< myList.length; i++) System.out.println(myList[i]);
	}

