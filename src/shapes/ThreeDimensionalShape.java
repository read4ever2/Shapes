package shapes;

/*
 * Filename: shapes.ThreeDimensionalShape.java
 * Author: Will Feighner
 * Date: 2020 11 04
 * Purpose:
 */

// import statements

public class ThreeDimensionalShape extends Shape {

  protected double volume;

  public ThreeDimensionalShape() {
    super(3);
  }

  public double getVolume() {
    return volume;
  }

}
