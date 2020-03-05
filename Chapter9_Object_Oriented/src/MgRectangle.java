// Define the circle class with two constructors
class MgRectangle {
  double width;
  double height;

  /** Construct a circle with radius 1 */
  MgRectangle() {
    width = 1;
    height = 1;
  }

  /** Construct a circle with a specified radius */
  MgRectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }

  /** Return the area of this circle */
  double getArea() {
    return width * height;
  }

  /** Return the perimeter of this circle */
  double getPerimeter() {
    return 2 * (width + height);
  }

  /** Set a new radius for this circle */
  void setRadius(double newWidth, double newHeight) {
	    width = newWidth;
	    height = newHeight;
  }
}
