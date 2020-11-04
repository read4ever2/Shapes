package shapes;

/*
 * Filename: Square.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Square extends TwoDimensionalShape {

  public Square(double side) {
    super();
    this.area = Math.pow(side, 2);
  }
}