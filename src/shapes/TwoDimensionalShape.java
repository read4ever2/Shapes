package shapes;/*
 * Filename: shapes.TwoDimensionalShape.java
 * Author: Will Feighner
 * Date: 2020 10 25
 * Purpose:
 */

// import statements

public class TwoDimensionalShape extends Shape {
  protected double area;

  public TwoDimensionalShape() {
    super(2);
  }

  public double getArea() {
    return area;
  }

}
