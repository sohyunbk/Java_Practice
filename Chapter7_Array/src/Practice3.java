import java.util.Arrays;

//3. The array list1 and list2 are identical if their corresponding elements are equal. 
//Write a method that returns true if list1 and list2 are identical using 
// public static boolean equals(int[]list1, int[]list2)

public class Practice3 {
	public static boolean equals(int[]list1, int[]list2) {
		//int nCheck = 0;
		
		if (list1.length != list2.length) {
			//nCheck = 1;
			return false;
		}
		else {
		for(int i =0; i< list1.length; i++) {
			if (list1[i] != list2[i]) {
				//nCheck +=1;
				return false;
			}
			//System.out.println(list1[i]);
		}
		return true;
		}
		
		//if (nCheck >0) return false;
		//else return true;
	}
	public static void main(String[] args) {
		int[] List1 = {2,5,8,13,14,15,16,17,20};
		int[] List2 = {2,5,8,13,14,15,16,17,20};
		int[] List3 = {2,5,9,10,14,15,16,17,30};
		int[] List4 = {2,5,8};
		//String[] myList = {"Area","Boy","Dear","Ear","Forest","Google"};
		
		//Arrays.sort(myList);
		//System.out.println(Arrays.toString(myList));
		
		boolean i =equals(List1, List3);
		System.out.print(i);
	}
}
