
public class Practice3 {
 public static void main(String[] args) {
	 E t1 = new E();
	 E t2 = new E();
	 System.out.println(t1.i);
	 System.out.println(t2.i);
	 
 }

}

class E{
	 static int i = 0;
	 int j = 0;
	 E(){
		 i++;
		 j=1;
	 }
}