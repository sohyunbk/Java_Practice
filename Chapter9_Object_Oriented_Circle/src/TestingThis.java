
public class TestingThis {
	public static void main(String[] args) {
	    Circle3 c1 = new Circle3();
	    Circle3 c2 = new Circle3();

	   // Modify c1
	    c1.setRadius (9);
	    c2.setRadius(20);

	    // Display c1 AFTER changing radius
	   
	    System.out.println("c1 radius is " + c1.radius 
	       );
	    System.out.println("c2 radius is  " + c2.radius +
	  	      "  and number of Circle objects is " +
	  	      Circle3.numberOfObjects );
	    if (c1.radiusGreater(c2))
	    {System.out.println("c1 has a larger radius");
	     }
	    else
	    {System.out.println("c2 has a larger radius");
	     }
	}
}
	     class Circle3 {
		  /** The radius of the circle */
		  double radius;

		  /** The number of the objects created */
		  static int numberOfObjects = 0;

		  /** Construct a circle with radius 1 */
		  Circle3() {
		    radius = 1.0;
		    numberOfObjects++;
		  }

		  /** Construct a circle with a specified radius */
		  Circle3 (double newRadius) {
		    radius = newRadius;
		    numberOfObjects++;
		  }

		  /** Return numberOfObjects */
		  int getNumberOfObjects() {
		    return numberOfObjects;
		  }

		  /** Return the area of this circle */
		  double getArea() {
		    return radius * radius * Math.PI;
		  }
		  void setRadius(double radius) {
			    this.radius = radius;
			  } 
	     boolean radiusGreater(Circle3 c)
	     { if (this.radius> c.radius)
	     {return true;
	     }
	     else {
	    	 return false;
	     }
	     }
	     }


