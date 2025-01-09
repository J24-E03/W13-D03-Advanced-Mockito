import java.util.Scanner;

/**
 * A simple calculator that can perform addition, subtraction, multiplication and division.
 * The user is prompted to enter two numbers and the operation they want to perform.
 * The result is then displayed to the user.
 */
public class Calculator {
  /**
   * Main entry point of the program.
   *
   * @param args The command line arguments.
   */
  public static void main(String[] args) {
    System.out.println("Enter first and second number:");
    Scanner input = new Scanner(System.in);

    int num1;
    int num2;
    num1 = input.nextInt();
    num2 = input.nextInt();

    StringBuilder sb = new StringBuilder();
    sb
        .append("Enter the operation: ")
        .append("+ for addition, ")
        .append("- for subtraction, ")
        .append("* for multiplication or ")
        .append("/ for division:");
    System.out.println(sb);
    String calcOperation;
    calcOperation = input.next();

    switch (calcOperation) {
      case "+":
        System.out.println(add(num1, num2));
        break;
      case "-":
        System.out.println(sub(num1, num2));
        break;
      case "*":
        System.out.println(multiply(num1, num2));
        break;
      case "/":
        System.out.println(divideNumbers(num1, num2));
        break;
      default:
        System.out.println("No operation selected");
    }
  }

  /**
   * Adds two numbers.
   *
   * @param x The first number.
   * @param y The second number.
   * @return The sum of the two numbers.
   */
  public static int add(int x, int y) {
    return x + y;
  }

  /**
   * Subtracts two numbers.
   *
   * @param x The first number.
   * @param y The second number.
   * @return The difference of the two numbers.
   */
  public static int sub(int x, int y) {
    return x - y;
  }

  /**
   * Multiplies two numbers.
   *
   * @param x The first number.
   * @param y The second number.
   * @return The product of the two numbers.
   */
  public static int multiply(int x, int y) {
    return x * y;
  }

  /**
   * Divides two numbers.
   *
   * @param x The first number.
   * @param y The second number.
   * @return The division of the two numbers.
   */
  public static int divideNumbers(int x, int y) {
    return x / y;
  }

}