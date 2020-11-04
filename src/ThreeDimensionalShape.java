/*
 * Filename: ThreeDimensionalShape.java
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

  static class Sphere extends ThreeDimensionalShape {

    public Sphere(double radius) {
      super();
      this.volume = Math.PI * Math.pow(radius, 3) * (4.0 / 3.0);
    }
  }

  static class Cube extends ThreeDimensionalShape {
    public Cube(double side) {
      super();
      this.volume = Math.pow(side, 3);
    }
  }

  static class Cone extends ThreeDimensionalShape {
    public Cone(double radius, double height) {
      super();
      this.volume = Math.PI * Math.pow(radius, 2) * (height / 3.0);
    }
  }

  static class Cylinder extends ThreeDimensionalShape {
    public Cylinder(double radius, double height) {
      super();
      this.volume = Math.PI * Math.pow(radius, 2) * height;
    }
  }

  static class Torus extends ThreeDimensionalShape {
    public Torus(double majorRadius, double minorRadius) {
      super();
      this.volume = (Math.PI * Math.pow(minorRadius, 2)) * (2 * Math.PI * majorRadius);
    }
  }
}
