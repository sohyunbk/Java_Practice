//1. Binary search for number
//2. Binary search for string

public class Practice1_BinarySearch_number {
	public static int binarySearch(int[] list, int key) {
		  int low = 0;
		  int high = list.length - 1;
		  while (high >= low) {
		    int mid = (low + high) / 2;
		    if (key < list[mid])
		      high = mid - 1;
		    else if (key == list[mid])
		      return mid;
		    else
		      low = mid + 1;
		  }
		  return -1;
		}
	public static void main(String[] args) {
		int[] myList = {2,5,8,13,14,15,16,17,20};
		int nOrder = binarySearch(myList,17);
		System.out.print(nOrder);
	}

}
