//2. Binary search for string
// Array.sort(list)
public class Practice2_BinarySearch_String {
	public static int binarySearch(String[] list, String key) {
		  int low = 0;
		  int high = list.length - 1;
		  //System.out.println(list[1].compareTo(list[2]));
		  //return 0;
		  while (high >= low) {
		    int mid = (low + high) / 2;
		    if (list[mid].compareTo(key)>0)
		      high = mid - 1;
		    else if (list[mid].compareTo(key)==0)
		      return mid;
		    else
		      low = mid + 1;
		  }
		  return -1;
		}
	public static void main(String[] args) {
		String[] myList = {"Area","Boy","Dear","Ear","Forest","Google"};
		int nOrder = binarySearch(myList,"Dear");
		System.out.print(nOrder);
	}

}
