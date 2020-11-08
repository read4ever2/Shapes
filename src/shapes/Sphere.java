package shapes;

/*
 * Filename: shapes.Sphere.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: Create sphere objects for shapes programs
 */

// import statements

class Sphere extends ThreeDimensionalShape {

  /**
   * @param radius -
   */

  public Sphere(double radius) {

    // Calls ThreeDimensionalShape constructor
    super();
    this.volume = Math.PI * Math.pow(radius, 3) * (4.0 / 3.0);
  } // end constructor
} // end sphere class