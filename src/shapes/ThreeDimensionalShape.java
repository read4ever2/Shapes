package shapes;

/*
 * Filename: shapes.ThreeDimensionalShape.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: provide superclass for three dimensional objects
 */

// import statements

public class ThreeDimensionalShape extends Shape {

  // Declare instance variables
  protected double volume;

  // Default constructor
  public ThreeDimensionalShape() {

    // Calls Shape constructor and sets number of dimensions
    super(3);
  } // end constructor

  public double getVolume() {
    return volume;
  } // end getVolume

} // end ThreeDimensionalShape class
