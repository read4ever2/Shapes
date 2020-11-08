package shapes;

/*
 * Filename: Torus.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: Creates Torus objects for shapes program
 */

// import statements

class Torus extends ThreeDimensionalShape {
  public Torus(double majorRadius, double minorRadius) {

    // Calls ThreeDimensionalShape constructor
    super();

    // Minor radius must be smaller then major radius
    this.volume = (Math.PI * Math.pow(minorRadius, 2)) * (2 * Math.PI * majorRadius);
  } // end Constructor
} // end Torus class