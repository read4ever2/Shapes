package shapes;

/*
 * Filename: Square.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: Create square objects for shapes program
 */

// import statements

class Square extends TwoDimensionalShape {

  /**
   * @param side -
   */

  // default constructor
  public Square(double side) {

    // Call TwoDimensionalShape constructor
    super();
    this.area = Math.pow(side, 2);
  } // end constructor
} // end Square class