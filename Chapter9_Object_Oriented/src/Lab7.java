//Write a class called Circle that containstwo variables: radius (of type double) and color (of type String); and three public member methods: getRadius(), getColor(), and getArea().Three constructed is defined. First constructor (default constructor) radius is 1.0 and color is ¡°Red¡±. Second constructor, default color is red,but radius is specified for the circle. The third constructor, both radius and color are specified. Write test program and make circle1 with default constructor, circle2 with radius 2 and default color of Red and circle3 with radius 3 and color ¡°Blue¡±.  Print radius, color and Area for each circle in main program

public class Lab7 {
 public static void main(String[] args) {
	 Circle circle1 = new Circle();
	 Circle circle2 = new Circle(2);
	 Circle circle3 = new Circle(3,"Blue");
	 System.out.println(circle1.getRaidus());
	 System.out.println(circle2.radius);
	 System.out.println(circle3.radius);
	 
	 System.out.println(circle1.getColor());
	 System.out.println(circle2.getColor());
	 System.out.println(circle3.color);
	 
 }

}

class Circle{
	 double radius;
	 String color;
	 Circle(){
		 radius = 1;
		 color = "Red";
	 }
	  Circle(double newRadius) {
		    radius = newRadius;
		    color ="Red";
		  
		  }
	  Circle(double newRadius, String newColor) {
		    radius = newRadius;
		    color = newColor;
		  }
	  

	  double getArea() {
		    return radius * radius * Math.PI;
		  }

		  /** Return the perimeter of this circle */
		  double getRaidus() {
		    return radius;
		  }
		  String getColor() {
			    return color;
			  }
}