/*
 * Filename: TwoDimensionalShape.java
 * Author: Will Feighner
 * Date: 2020 10 25
 * Purpose:
 */

// import statements

public class TwoDimensionalShape extends Shape {
  double area;
  double perimeter;

  public TwoDimensionalShape() {
    super(2);
  }

  public double getArea() {
    return area;
  }

  public double getPerimeter() {
    return perimeter;
  }

  static class Circle extends TwoDimensionalShape implements TwoDShape {
    double radius;

    public Circle() {}

    public void setRadius(double radius) {
      this.radius = radius;
    }

    @Override
    public void calcArea() {
      area = Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public void calcPerimeter() {
      perimeter = 2 * Math.PI * radius;
    }
  }

  static class Square extends TwoDimensionalShape implements TwoDShape {
    double side;

    public void setSide(double side) {
      this.side = side;
    }

    @Override
    public void calcArea() {
      area = Math.pow(area, 2);
    }

    @Override
    public void calcPerimeter() {
      perimeter = side * 4;
    }
  }

  static class Triangle extends TwoDimensionalShape implements TwoDShape {
    double base;
    double height;

    public void setBase(double base) {
      this.base = base;
    }

    public void setHeight(double height) {
      this.height = height;
    }

    @Override
    public void calcArea() {
      area = 0.5 * base * height;
    }

    @Override
    public void calcPerimeter() {

    }
  }
}
