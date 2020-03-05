
public class Practice1 {
 public static void main(String[] args) {
	 T t1 = new T();
	 T t2 = new T();
	 System.out.println(t1.i);
	 System.out.println(t2.i);
	 
 }

}

class T{
	 static int i = 0;
	 int j = 0;
	 T(){
		 i++;
		 j=1;
	 }
}