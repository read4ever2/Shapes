package shapes;

/*
 * Filename: shapes.Shapes.java
 * Author: Will Feighner
 * Date: 2020 10 25
 * Purpose:
 */

// import statements

import java.time.LocalDateTime;
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

      String selection = scanner.nextLine();

      switch (selection) {
        case "1" -> {
          System.out.println("You have selected Circle\n");
          double radius = 0.0;
          radius = getValue(radius, "What is the radius?");
          Circle circle = new Circle(radius);
          System.out.printf("The area of the Circle is %f.2%n\n", circle.getArea());
          wantContinue();
        }
        case "2" -> {
          System.out.println("You have selected Rectangle\n");
          double length = 0.0;
          double width = 0.0;
          length = getValue(length, "What is the length?");
          width = getValue(width, "What is the width?");
          Rectangle rectangle = new Rectangle(length, width);
          System.out.println("The area of the Rectangle is " + rectangle.getArea());
          wantContinue();
        }
        case "3" -> {
          System.out.println("You have selected Square\n");
          double side = 0.0;
          side = getValue(side, "What is the length of a side?");
          Square square = new Square(side);
          System.out.println("The area of the Square is " + square.getArea());
          wantContinue();
        }
        case "4" -> {
          System.out.println("You have selected Triangle\n");
          System.out.println("What is the base?");
          double base = 0.0;
          base = getValue(scanner, validDouble, base, "What is the length of the base?");
          System.out.println("What is the height?");
          double height = 0.0;
          height = getValue(scanner, validDouble, height, "What is the height?");
          Triangle triangle = new Triangle(base, height);
          System.out.println("The area of the Square is " + triangle.getArea());
        }
        case "5" -> {
          System.out.println("You have selected Sphere\n");
          System.out.println("What is the radius?");
          double radius = scanner.nextDouble();
          Sphere sphere = new Sphere(radius);
          System.out.println("The volume of the shapes.Sphere is " + sphere.getVolume());
        }
        case "6" -> {
          System.out.println("You have selected Cube\n");
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
    LocalDateTime date = LocalDateTime.now();
    System.out.println("Thanks for using the program. Today is "
        + date.getDayOfMonth()
        + " " + date.getMonth()
        + " at " + date.getHour()
        + ":" + date.getMinute());
  }

  private static double getValue(double value, String s) {
    boolean validDouble = true;
    do {
      Scanner scanner = new Scanner(System.in);
      System.out.println(s);
      String test = scanner.nextLine();
      if (isDouble(test)) {
        value = Double.parseDouble(test);
        validDouble = false;
      } else {
        System.out.println("Invalid Entry. Please enter a decimal value:");
      }
    } while (validDouble);
    return value;
  }

  public static boolean isDouble(String input) {
    try {
      double test = Double.parseDouble(input);
    } catch (NumberFormatException ignored) {
      return false;
    }
    return true;
  }

  public static void wantContinue() {
    Scanner scanner = new Scanner(System.in);
    boolean exitLoop = true;
    do {
      System.out.println("Do you want to continue? (Y/N)");
      String input = scanner.nextLine();
      if ((input.equals("n") || input.equals("N"))) {
        LocalDateTime date = LocalDateTime.now();
        System.out.println("Thanks for using the program. Today is "
            + date.getDayOfMonth()
            + " " + date.getMonth()
            + " at " + date.getHour()
            + ":" + date.getMinute());
        exitLoop = false;
        System.exit(0);
      } else if ((input.equals("y") || input.equals("Y"))) {
        exitLoop = false;
        return;
      }
      System.out.println("Invalid Input.");
    } while (exitLoop);
  }
}
