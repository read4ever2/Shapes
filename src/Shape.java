/*
 * Filename: Shape.java
 * Author: Will Feighner
 * Date: 2020 10 25
 * Purpose:
 */

// import statements

import java.util.Scanner;

public abstract class Shape {
  int numberDimensions;

  public Shape(int numberDimensions) {
    this.numberDimensions = numberDimensions;
  }

  public static void main(String[] args) {

    System.out.println("\n********* Welcome to the Java OO Shapes Program **********\n");

    boolean exitLoop = false;
    do {
      System.out.println("Select from the menu below:\n");
      System.out.println(
          "1. Construct a Circle\n"
              + "2. Construct a Rectangle\n"
              + "3. Construct a Square\n"
              + "4. Construct a Triangle\n"
              + "5. Construct a Sphere\n"
              + "6. Construct a Cube\n"
              + "7. Construct a Cone\n"
              + "8. Construct a Cylinder\n"
              + "9. Construct a Torus\n"
              + "X. Exit the program\n");

      Scanner scanner = new Scanner(System.in);
      String selection = scanner.nextLine();

      switch (selection) {
        case "1" -> {
          System.out.println("You have selected Circle\n");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          TwoDimensionalShape.Circle circle = new TwoDimensionalShape.Circle(radius);
          System.out.println("The area of the Circle is " + circle.getArea());
        }
        case "2" -> {
          System.out.println("You have selected Rectangle\n");
          System.out.println("What is the length?");
          double length = scanner.nextDouble();
          System.out.println("What is the width?");
          double width = scanner.nextDouble();
          TwoDimensionalShape.Rectangle rectangle =
              new TwoDimensionalShape.Rectangle(length, width);
          System.out.println("The area of the Rectangle is " + rectangle.getArea());
        }
        case "3"-> {
          System.out.println("You have selected Square\n");
          System.out.println("What is the length of a side?");
          double side = scanner.nextDouble();
          TwoDimensionalShape.Square square =new TwoDimensionalShape.Square(side);
          System.out.println("The area of the Square is " + square.getArea());
        }
        case "4"-> {
          System.out.println("You have selected Triangle\n");
          System.out.println("What is the base?");
          double base = scanner.nextDouble();
          System.out.println("What is the height?");
          double height = scanner.nextDouble();
          TwoDimensionalShape.Triangle triangle = new TwoDimensionalShape.Triangle(base,height);
          System.out.println("The area of the Square is " + triangle.getArea());
        }
        case "5"-> {
          System.out.println("You have selected Sphere\n");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          ThreeDimensionalShape.Sphere sphere= new ThreeDimensionalShape.Sphere(radius);
          System.out.println("The volume of the Sphere is " + sphere.getVolume());
        }
        case "6"-> {
          System.out.println("You have selected Cube\n");
          System.out.println("What is the length of a side?");
          double side = scanner.nextDouble();
          ThreeDimensionalShape.Cube cube=new ThreeDimensionalShape.Cube(side);
          System.out.println("The volume of the Cube is " + cube.getVolume());
        }
        case "7" -> {
          System.out.println("You have selected Cone\n");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          System.out.println("What is the height?");
          double height = scanner.nextDouble();
          ThreeDimensionalShape.Cone cone=new ThreeDimensionalShape.Cone(radius,height);
          System.out.printf("The volume of the Cube is %.2f",cone.getVolume());
        }
        case "8" -> {
          System.out.println("You have selected Cylinder");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          System.out.println("What is the height?");
          double height = scanner.nextDouble();
          ThreeDimensionalShape.Cylinder cylinder = new ThreeDimensionalShape.Cylinder(radius,height);
          System.out.printf("The volume of the cylinder is %.2f",cylinder.getVolume());
        }
        case "X","x"-> exitLoop = true;
        default -> System.out.println("Invalid Selection. Please select again.");
      }
    } while (exitLoop);
  }
}
