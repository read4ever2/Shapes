package shapes;

/*
 * Filename: shapes.Shapes.java
 * Author: Will Feighner
 * Date: 2020 10 25
 * Purpose: Main driver for Shapes program
 */

// import statements

import java.time.LocalDateTime;
import java.util.Scanner;

public class Shapes {

  public static void main(String[] args) {

    System.out.println("\n********* Welcome to the Java OO shapes.Shapes Program **********\n");

    // Declare instance variables
    boolean exitLoop = true;

    // Main menu loop
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

      // read input
      Scanner input = new Scanner(System.in);
      String selection = input.nextLine();

      // process user entry
      switch (selection) {

        // Circle selection
        case "1" -> {
          System.out.println("You have selected Circle\n");

          // Set radius
          double radius = getValue("What is the radius?");

          // create object
          Circle circle = new Circle(radius);

          // output results
          System.out.printf("The area of the Circle is %.2f\n", circle.getArea());
          wantContinue();
        } // end circle selection

        // Rectangle selection
        case "2" -> {
          System.out.println("You have selected Rectangle\n");

          // get length and width
          double length = getValue("What is the length?");
          double width = getValue("What is the width?");

          // create object
          Rectangle rectangle = new Rectangle(length, width);

          // output results
          System.out.printf("The area of the Rectangle is %.2f\n", rectangle.getArea());
          wantContinue();
        } // End rectangle selection

        case "3" -> {
          System.out.println("You have selected Square\n");

          // get side
          double side = getValue("What is the length of a side?");

          // create object
          Square square = new Square(side);

          // output results
          System.out.printf("The area of the Square is %.2f\n", square.getArea());
          wantContinue();
        } // end square selection

        // triangle selection
        case "4" -> {
          System.out.println("You have selected Triangle\n");

          // get base and height
          double base = getValue("What is the length of the base?");
          double height = getValue("What is the height?");

          // create object
          Triangle triangle = new Triangle(base, height);

          // output results
          System.out.printf("The area of the Triangle is %.2f\n", triangle.getArea());
          wantContinue();
        } // end triangle selection

        // Sphere selection
        case "5" -> {
          System.out.println("You have selected Sphere\n");

          // get radius
          double radius = getValue("What is the radius?");

          // create object
          Sphere sphere = new Sphere(radius);

          // output results
          System.out.printf("The volume of the Sphere is %.2f\n", sphere.getVolume());
          wantContinue();
        } // end sphere selection

        // Cube selection
        case "6" -> {
          System.out.println("You have selected Cube\n");

          // get side
          double side = getValue("What is the length of a side?");

          // create object
          Cube cube = new Cube(side);

          // output results
          System.out.printf("The volume of the Cube is %.2f\n", cube.getVolume());
          wantContinue();
        } // end cube selection

        // Cone selection
        case "7" -> {
          System.out.println("You have selected Cone\n");

          // get radius and height
          double radius = getValue("What is the radius?");
          double height = getValue("What is the height?");

          // create object
          Cone cone = new Cone(radius, height);

          // output results
          System.out.printf("The volume of the Cone is %.2f\n", cone.getVolume());
          wantContinue();
        } // end cone selection

        // Cylinder selection
        case "8" -> {
          System.out.println("You have selected Cylinder");

          // get radius and height
          double radius = getValue("What is the radius?");
          double height = getValue("What is the height?");

          // create object
          Cylinder cylinder = new Cylinder(radius, height);

          // output results
          System.out.printf("The volume of the cylinder is %.2f\n", cylinder.getVolume());
          wantContinue();
        } // end cylinder selection

        // Torus selection
        case "9" -> {
          System.out.println("You have selected Torus");

          // get minor radius and major radius
          double majorRadius = getValue("What is the major radius?");
          double minorRadius = getValue("What is the minor radius?");

          // verify major radius is larger then minor radius
          if (majorRadius < minorRadius) {
            System.out.println("Major Radius must be larger the minor radius!");
            continue;
          } // end if block

          // create object
          Torus torus = new Torus(majorRadius, minorRadius);

          // output results
          System.out.printf("The volume of the torus is %.2f\n", torus.getVolume());
          wantContinue();
        } // end torus selection

        // exit selection
        case "X", "x" -> exitLoop = false;

        // invalid entry goes to default, restarts loop
        default -> System.out.println("Invalid Selection. Please select again.");
      } // end switch block
    } while (exitLoop);
    // end do-while loop

    // create Date-time object for sign off
    LocalDateTime date = LocalDateTime.now();

    // output sign off message
    System.out.println("Thanks for using the program. Today is "
        + date.getDayOfMonth()
        + " " + date.getMonth()
        + " at " + date.getHour()
        + ":" + date.getMinute());
  } // end main method

  // get value method
  private static double getValue(String s) {

    // local variables
    boolean validDouble = true;
    double value = 0.0;

    // do loop until valid double entered
    do {
      Scanner scanner = new Scanner(System.in);

      // print value prompt
      System.out.println(s);
      String test = scanner.nextLine();

      // test for double, assign if true
      if (isDouble(test)) {
        value = Double.parseDouble(test);
        validDouble = false;
      } else {
        System.out.println("Invalid Entry. Please enter a positive decimal value:");
      } // end if block
    } while (validDouble);
    // end do-while loop
    return value;
  } // end getValue

  // ensure entry is positive double
  public static boolean isDouble(String input) {
    double test;
    try {
      test = Double.parseDouble(input);
    } catch (NumberFormatException ignored) {
      return false;
    }
    return test >= 0.0;
  } // end isDouble

  // post object creation continue options
  public static void wantContinue() {
    Scanner scanner = new Scanner(System.in);
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
        System.exit(0);
      } else if ((input.equals("y") || input.equals("Y"))) {
        return;
      }
      System.out.println("Invalid Input.");
    } while (true);
  } // end wantContinue
} // end shapes class
