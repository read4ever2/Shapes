package shapes;

/*
 * Filename: Cone.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

class Cone extends ThreeDimensionalShape {

  /**
   * @param radius -
   * @param height-
   */

  public Cone(double radius, double height) {
    super();
    this.volume = Math.PI * Math.pow(radius, 2) * (height / 3.0);
  }
}