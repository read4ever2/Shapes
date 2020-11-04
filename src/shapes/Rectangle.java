package shapes;

/*
 * Filename: Rectangle.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Rectangle extends TwoDimensionalShape {

  public Rectangle(double length, double width) {
    super();
    this.area = length * width;
  }
}