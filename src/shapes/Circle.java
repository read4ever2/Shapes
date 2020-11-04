package shapes;

/*
 * Filename: Circle.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Circle extends TwoDimensionalShape {

  public Circle(double radius) {
    super();
    this.area = Math.pow(radius, 2) * Math.PI;
  }
}