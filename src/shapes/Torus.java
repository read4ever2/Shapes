package shapes;

/*
 * Filename: Torus.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Torus extends ThreeDimensionalShape {
  public Torus(double majorRadius, double minorRadius) {
    super();
    this.volume = (Math.PI * Math.pow(minorRadius, 2)) * (2 * Math.PI * majorRadius);
  }
}