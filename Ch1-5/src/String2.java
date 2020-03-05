
public class String2 {
	
	public static void main(String[] args) {
	String s1 = "Welcome";
	String s2 = "welcome";
	
	//a
	boolean isEqual =  s1.equals(s2);
	//b
	boolean isEqual2 =  s1.equalsIgnoreCase(s2);
	//c
	int x = s1.compareTo(s2);
	//d
	int x2 = s1.compareToIgnoreCase(s2);
	//e
	boolean b = s1.startsWith("AAA");
	//f
	boolean b2 = s1.endsWith("AAA");
	//g
	int x3 = s1.length();

	
	System.out.println(s1.equals(s2));
	System.out.println(s1.toLowerCase().equals(s2.toLowerCase()));
	System.out.println(s1.compareTo(s2));
	System.out.println(s1.toLowerCase().compareTo(s2.toLowerCase()));
	System.out.println(s1.startsWith("AAA")); // Assign the result to a boolean variable b? 
	Boolean b33 =  s1.startsWith("AAA");
	
	
	System.out.println(s1.endsWith("AAA")); //
	System.out.println(s1.length());
	
	//h
	char x4 = s1.charAt(0);
	//i
	String s3 = s1.concat(s2); // ??
	String s31 = s1 + s2;

	//j
	System.out.println(s1.substring(1));
	//k
	System.out.println(s1.substring(1,5)); // not substring(1,4)!!
	//l
	String s32 = s1.toLowerCase();
	//m
	String s33 = s1.toUpperCase();
	//n
	String s34 = s1.trim();
	//o
	int X = s1.indexOf('e');
	//p
	int X2 = s1.lastIndexOf("abc"); // µ˚ø»«• µŒ∞≥¿”!! ¡÷¿« «œªÔ
	
	System.out.println(X); 
	System.out.println(X2); 



	}
}
