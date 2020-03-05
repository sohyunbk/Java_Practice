
public class Search_Array {
	 public static void main(String[] args) {
		 int[] myList = {2,3,4,5};
		 String[] list2 = {"sohyun","is","heavy"};
		 int j = linearSearchInt(myList,4);
		 int w = linearSearchString(list2, "sohyun");
		 System.out.println(w);
		}
		
		public static int linearSearchString(String[] list, String key) {
			 for(int i =0; i<list.length;i++)
				 if(key == list[i]) // or .equals
					 return i;
			 return -1;
		 }
	
	public static int linearSearchInt(int[] list, int key) {
	 for(int i =0; i<list.length;i++)
		 if(key == list[i])
			 return i;
	 return -1;
 }
}
