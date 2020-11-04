package shapes;

/*
 * Filename: Triangle.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Triangle extends TwoDimensionalShape {

  public Triangle(double base, double height) {
    super();
    this.area = base * height * 0.5;
  }
}