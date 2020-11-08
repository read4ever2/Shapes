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
              + "5. Construct a Sphere\n"
              + "6. Construct a Cube\n"
              + "7. Construct a Cone\n"
              + "8. Construct a Cylinder\n"
              + "9. Construct a Torus\n"
              + "X. Exit the program\n");

      Scanner input = new Scanner(System.in);

      String selection = input.nextLine();

      switch (selection) {
        case "1" -> {
          System.out.println("You have selected Circle\n");
          double radius = getValue("What is the radius?");
          Circle circle = new Circle(radius);
          System.out.printf("The area of the Circle is %.2f\n", circle.getArea());
          wantContinue();
        }
        case "2" -> {
          System.out.println("You have selected Rectangle\n");
          double length = getValue("What is the length?");
          double width = getValue("What is the width?");
          Rectangle rectangle = new Rectangle(length, width);
          System.out.printf("The area of the Rectangle is %.2f\n", rectangle.getArea());
          wantContinue();
        }
        case "3" -> {
          System.out.println("You have selected Square\n");
          double side = getValue("What is the length of a side?");
          Square square = new Square(side);
          System.out.printf("The area of the Square is %.2f\n", square.getArea());
          wantContinue();
        }
        case "4" -> {
          System.out.println("You have selected Triangle\n");
          double base = getValue("What is the length of the base?");
          double height = getValue("What is the height?");
          Triangle triangle = new Triangle(base, height);
          System.out.printf("The area of the Square is %.2f\n", triangle.getArea());
          wantContinue();
        }
        case "5" -> {
          System.out.println("You have selected Sphere\n");
          double radius = getValue("What is the radius?");
          Sphere sphere = new Sphere(radius);
          System.out.printf("The volume of the Sphere is %.2f\n", sphere.getVolume());
          wantContinue();
        }
        case "6" -> {
          System.out.println("You have selected Cube\n");
          double side = getValue("What is the length of a side?");
          Cube cube = new Cube(side);
          System.out.printf("The volume of the Cube is %.2f\n", cube.getVolume());
          wantContinue();
        }
        case "7" -> {
          System.out.println("You have selected Cone\n");
          double radius = getValue("What is the radius?");
          double height = getValue("What is the height?");
          Cone cone = new Cone(radius, height);
          System.out.printf("The volume of the Cone is %.2f\n", cone.getVolume());
          wantContinue();
        }
        case "8" -> {
          System.out.println("You have selected Cylinder");
          double radius = getValue("What is the radius?");
          double height = getValue("What is the height?");
          Cylinder cylinder = new Cylinder(radius, height);
          System.out.printf("The volume of the cylinder is %.2f\n", cylinder.getVolume());
          wantContinue();
        }
        case "9" -> {
          System.out.println("You have selected Torus");
          double majorRadius = getValue("What is the major radius?");
          double minorRadius = getValue("What is the minor radius?");
          Torus torus = new Torus(majorRadius, minorRadius);
          System.out.printf("The volume of the torus is %.2f\n", torus.getVolume());
          wantContinue();
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

  private static double getValue(String s) {
    boolean validDouble = true;
    double value = 0.0;
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
