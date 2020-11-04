package shapes;/*
 * Filename: shapes.Shapes.java
 * Author: Will Feighner
 * Date: 2020 10 25
 * Purpose:
 */

// import statements

import java.util.Scanner;

public class Shapes {

  public static void main(String[] args) {

    System.out.println("\n********* Welcome to the Java OO shapes.Shapes Program **********\n");

    boolean exitLoop = true;
    do {
      System.out.println("Select from the menu below:\n");
      System.out.println(
          "1. Construct a Circle\n"
              + "2. Construct a Rectangle\n"
              + "3. Construct a Square\n"
              + "4. Construct a Triangle\n"
              + "5. Construct a shapes.Sphere\n"
              + "6. Construct a shapes.Cube\n"
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
          Circle circle = new Circle(radius);
          System.out.println("The area of the Circle is " + circle.getArea());
        }
        case "2" -> {
          System.out.println("You have selected Rectangle\n");
          System.out.println("What is the length?");
          double length = scanner.nextDouble();
          System.out.println("What is the width?");
          double width = scanner.nextDouble();
          Rectangle rectangle =
              new Rectangle(length, width);
          System.out.println("The area of the Rectangle is " + rectangle.getArea());
        }
        case "3" -> {
          System.out.println("You have selected Square\n");
          System.out.println("What is the length of a side?");
          double side = scanner.nextDouble();
          Square square = new Square(side);
          System.out.println("The area of the Square is " + square.getArea());
        }
        case "4" -> {
          System.out.println("You have selected Triangle\n");
          System.out.println("What is the base?");
          double base = scanner.nextDouble();
          System.out.println("What is the height?");
          double height = scanner.nextDouble();
          Triangle triangle = new Triangle(base, height);
          System.out.println("The area of the Square is " + triangle.getArea());
        }
        case "5" -> {
          System.out.println("You have selected shapes.Sphere\n");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          Sphere sphere = new Sphere(radius);
          System.out.println("The volume of the shapes.Sphere is " + sphere.getVolume());
        }
        case "6" -> {
          System.out.println("You have selected shapes.Cube\n");
          System.out.println("What is the length of a side?");
          double side = scanner.nextDouble();
          Cube cube = new Cube(side);
          System.out.println("The volume of the shapes.Cube is " + cube.getVolume());
        }
        case "7" -> {
          System.out.println("You have selected Cone\n");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          System.out.println("What is the height?");
          double height = scanner.nextDouble();
          Cone cone = new Cone(radius, height);
          System.out.printf("The volume of the shapes.Cube is %.2f", cone.getVolume());
        }
        case "8" -> {
          System.out.println("You have selected Cylinder");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          System.out.println("What is the height?");
          double height = scanner.nextDouble();
          Cylinder cylinder = new Cylinder(radius, height);
          System.out.printf("The volume of the cylinder is %.2f", cylinder.getVolume());
        }
        case "9" -> {
          System.out.println("You have selected Torus");
          System.out.println("What is the Major Radius?");
          double majorRadius = scanner.nextDouble();
          System.out.println("What is the Minor Radius?");
          double minorRadius = scanner.nextDouble();
          Torus torus = new Torus(majorRadius, minorRadius);
          System.out.printf("The volume of the torus is %.2f", torus.getVolume());
        }
        case "X", "x" -> exitLoop = false;
        default -> System.out.println("Invalid Selection. Please select again.");
      }
    } while (exitLoop);
    System.out.println("");
  }
}
