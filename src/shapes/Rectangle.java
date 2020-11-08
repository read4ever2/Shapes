package shapes;

/*
 * Filename: Rectangle.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: create rectangle objects for shapes program
 */

// import statements

class Rectangle extends TwoDimensionalShape {

  /**
   * @param length -
   * @param width  -
   */

  public Rectangle(double length, double width) {

    // Calls TwoDimensionalShape constructor
    super();
    this.area = length * width;
  } // end constructor
} // end Rectangle class