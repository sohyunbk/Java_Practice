public class Practice4 {
 public static void main(String[] args) {
	 F f = new F();
	 System.out.println(F.s);
	 System.out.println(F.s);
	 f.imethod();
	 f.smethod();
	 System.out.println(F.i);
	 System.out.println(F.s);
	 F.imethod();
	 F.smethod();
 }}

class F{
	int i;
	static String s;
	void imethod(){
	}
	static void smethod() {
	}
}
