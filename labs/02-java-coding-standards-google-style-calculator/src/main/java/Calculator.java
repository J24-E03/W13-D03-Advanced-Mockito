import java.util.Scanner;

/**
 * A simple calculator program to perform basic arithmetic operations.
 */
public class Calculator {

  /**
   * The main method to execute the calculator.
   *
   * @param args Command-line arguments (not used in this program).
   */
  public static void main(String[] args) {
    System.out.println("Enter first and second number:");
    Scanner input = new Scanner(System.in);

    int num1, num2;
    num1 = input.nextInt();
    num2 = input.nextInt();

    System.out.println("Enter the operation: + for addition, - for subtraction, * for multiplication, or / for division:");
    String calcOperation = input.next();

    switch (calcOperation) {
      case "+":
        System.out.println(add(num1, num2));
        break;
      case "-":
        System.out.println(subtract(num1, num2));
        break;
      case "*":
        System.out.println(multiply(num1, num2));
        break;
      case "/":
        if (num2 != 0) {
          System.out.println(divide(num1, num2));
        } else {
          System.out.println("Error: Division by zero is not allowed.");
        }
        break;
      default:
        System.out.println("Invalid operation selected.");
    }
  }

  /**
   * Adds two integers.
   *
   * @param x The first integer.
   * @param y The second integer.
   * @return The sum of x and y.
   */
  public static int add(int x, int y) {
    return x + y;
  }

  /**
   * Subtracts the second integer from the first.
   *
   * @param x The first integer.
   * @param y The second integer.
   * @return The result of x minus y.
   */
  public static int subtract(int x, int y) {
    return x - y;
  }

  /**
   * Multiplies two integers.
   *
   * @param x The first integer.
   * @param y The second integer.
   * @return The product of x and y.
   */
  public static int multiply(int x, int y) {
    return x * y;
  }

  /**
   * Divides the first integer by the second.
   *
   * @param x The numerator.
   * @param y The denominator (must not be zero).
   * @return The result of x divided by y.
   */
  public static int divide(int x, int y) {
    return x / y;
  }
}
