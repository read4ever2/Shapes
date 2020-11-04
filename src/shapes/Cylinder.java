package shapes;

/*
 * Filename: Cylinder.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Cylinder extends ThreeDimensionalShape {
  public Cylinder(double radius, double height) {
    super();
    this.volume = Math.PI * Math.pow(radius, 2) * height;
  }
}