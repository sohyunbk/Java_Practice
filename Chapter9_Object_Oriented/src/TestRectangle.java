// static means just one copy no matter how many objects are created

public class TestRectangle {
  /** Main method */
  public static void main(String[] args) {
    // Create a circle with radius 1
    MgRectangle circle1 = new MgRectangle(); // circle1 이 object 라고 할 수 있음.
    System.out.println("Width "
      + circle1.width + " and Hight "+ circle1.height + "'s area is " + circle1.getArea());

    // Create a circle with radius 25
    MgRectangle circle2 = new MgRectangle(5,1);
    System.out.println("Width "
    	      + circle2.width + " and Hight "+ circle2.height + "'s area is " + circle2.getArea());

  }
}

