package shapes;

/*
 * Filename: shapes.Cube.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: create cube objects for shapes program
 */

// import statements

class Cube extends ThreeDimensionalShape {

  /**
   * @param side -
   */

  // default constructor
  public Cube(double side) {

    // Calls ThreeDimensionalShape constructor
    super();
    this.volume = Math.pow(side, 3);
  } // end constructor
} // end cube class