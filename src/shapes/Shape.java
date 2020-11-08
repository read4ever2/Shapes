package shapes;

/*
 * Filename: shapes.Shape.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: Provide super class for Two and Three dimensional shape objects
 */

// import statements

public abstract class Shape {

  // Declare instance variables
   private final int numberDimensions;

  /**
   * @param numberDimensions -shape dimensions
   */

  // Default constructor
  public Shape(int numberDimensions) {
    this.numberDimensions = numberDimensions;
  } // end constructor

} // end Shape class