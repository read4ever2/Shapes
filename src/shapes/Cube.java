package shapes;/*
 * Filename: shapes.Cube.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Cube extends ThreeDimensionalShape {
  public Cube(double side) {
    super();
    this.volume = Math.pow(side, 3);
  }
}