class circlewithStatic {
  /** Main method */
  public static void main(String[] args) {
    System.out.println("Before creating objects");
    System.out.println("The number of Circle objects is " +
      Circle2.numberOfObjects);

    // Create c1
    Circle2 c1 = new Circle2();

    // Display c1 BEFORE c2 is created
    System.out.println("\nAfter creating c1");
    System.out.println("c1: radius (" + c1.radius +
      ") and number of Circle objects (" +
      Circle2.numberOfObjects + ")");

    // Create c2
    Circle2 c2 = new Circle2(5);

    // Modify c1
    c1.setRadius(9);

    // Display c1 and c2 AFTER c2 was created
    System.out.println("\nAfter creating c2 and modifying c1");
    System.out.println("c1: radius (" + c1.radius +
      ") and number of Circle objects (" +
      Circle2.numberOfObjects + ")");
    System.out.println("c2: radius (" + c2.radius +
      ") and number of Circle objects (" +
      Circle2.numberOfObjects + ")");
  }
}

     class Circle2 {
	  /** The radius of the circle */
	  double radius;

	  /** The number of the objects created */
	  static int numberOfObjects = 0;

	  /** Construct a circle with radius 1 */
	  Circle2() {
	    radius = 1.0;
	    numberOfObjects++;
	  }

	  /** Construct a circle with a specified radius */
	  Circle2 (double newRadius) {
	    radius = newRadius;
	    numberOfObjects++;
	  }

	  /** Return numberOfObjects */
	  static int getNumberOfObjects() {
	    return numberOfObjects;
	  }

	  /** Return the area of this circle */
	  double getArea() {
	    return radius * radius * Math.PI;
	  }
	  void setRadius(double newRadius) {
		    radius = newRadius;
		  } 
     
     }

