package shapes;

/*
 * Filename: Triangle.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: Creates triangle objects for shapes programs
 */

// import statements

class Triangle extends TwoDimensionalShape {

  // Creates Triangle Object
  public Triangle(double base, double height) {

    // Calls TwoDimensionalShape constructor
    super();

    // Assumes base and height are known
    this.area = base * height * 0.5;
  } // End constructor
} // end triangle class