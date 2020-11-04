package shapes;

/*
 * Filename: shapes.Sphere.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Sphere extends ThreeDimensionalShape {
  public Sphere(double radius) {
    super();
    this.volume = Math.PI * Math.pow(radius, 3) * (4.0 / 3.0);
  }
}