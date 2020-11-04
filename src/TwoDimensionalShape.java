/*
 * Filename: TwoDimensionalShape.java
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

  static class Circle extends TwoDimensionalShape {

    public Circle(double radius) {
      super();
      this.area = Math.pow(radius, 2) * Math.PI;
    }
  }

  static class Rectangle extends TwoDimensionalShape {

    public Rectangle(double length, double width) {
      super();
      this.area = length * width;
    }
  }

  static class Square extends TwoDimensionalShape {

    public Square(double side) {
      super();
      this.area = Math.pow(side, 2);
    }
  }

  static class Triangle extends TwoDimensionalShape {

    public Triangle(double base, double height) {
      super();
      this.area = base * height * 0.5;
    }
  }
}
