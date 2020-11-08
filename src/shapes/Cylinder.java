package shapes;

/*
 * Filename: Cylinder.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose: Create cylinder objects for shapes program
 */

// import statements

class Cylinder extends ThreeDimensionalShape {

  /**
   * @param radius -
   * @param height -
   */

  public Cylinder(double radius, double height) {

    // Calls ThreeDimensionalShape constructor
    super();
    this.volume = Math.PI * Math.pow(radius, 2) * height;
  } // end constructor
} // end Cylinder class