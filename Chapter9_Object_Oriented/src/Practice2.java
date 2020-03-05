class Practice2 {
 public static void main(String[] args) {
	 C3 a3 = new C3(13);
	 System.out.println();
	 
 }}

class C3{
	private int p;
	
	public C3(){
		this(0);
		System.out.println("C's no-arg constructor invoked");
	}
	public C3(int p) {
		this.p = p;
	}
	public void setP(int p) {
		this.p = p;
	}
}