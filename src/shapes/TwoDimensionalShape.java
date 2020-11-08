package shapes;

/*
 * Filename: shapes.TwoDimensionalShape.java
 * Author: Will Feighner
 * Date: 2020 10 25
 * Purpose: Provides a super class for two dimensional shapes and area
 */

// import statements

public class TwoDimensionalShape extends Shape {

  // Declare instance variables
  protected double area;

  // Default constructor
  public TwoDimensionalShape() {

    // Calls Shape constructor and sets number of dimensions
    super(2);
  } // end constructor


  public double getArea() {
    return area;
  } // end get area
} // end TwoDimensionalShape
