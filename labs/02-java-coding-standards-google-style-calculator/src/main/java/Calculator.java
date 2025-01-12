import java.util.Scanner;

/**
 * The {Calculator} class provides methods to perform basic arithmetic operations.
 * It includes methods for addition, subtraction, multiplication, and division.
 *
 *
 */
public class Calculator {

  /**
   * The entry point of the application. This method is called when the program is run.
   * It processes the command-line arguments and starts the execution of the program.
   *
   * @param args Command-line arguments passed to the program.
   */
  public static void main(String[] args) {
    System.out.println("Enter first and second number:");
    Scanner input = new Scanner(System.in);

    int num1;
    int num2;
    num1 = input.nextInt();
    num2 = input.nextInt();

    System.out.println("Enter the operation: + for addition, - for subtraction, * for multiplication or / for division:");
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
   * Adds two integers and returns the result.
   *
   * @param x The first integer to be added.
   * @param y The second integer to be added.
   * @return The sum of {@code x} and {@code y}.
   */

  public static int add(int x, int y) {
    int result = x + y;
    return result;
  }

  /**
   * Subtracts the second integer from the first and returns the result.
   *
   * @param x The integer from which y will be subtracted.
   * @param y The integer to be subtracted from x.
   * @return The result of x minus y.
   */
  public static int sub(int x, int y) {
    int result = x - y;
    return result;
  }

  /**
   * Multiplies two integers and returns the result.
   *
   * @param x The first integer to be multiplied.
   * @param y The second integer to be multiplied.
   * @return The product of x and y
   */
  public static int multiply(int x, int y) {
    int result =  x * y;
    return result;
  }

  /**
   * Divides two integers and returns the result.
   *
   * <p>Note: This method does not handle division by zero. If {y} is zero,
   * an {ArithmeticException} will be thrown.</p>
   *
   * @param x The dividend (the number to be divided).
   * @param y The divisor (the number by which {x} is divided).
   * @return The result of dividing {x} by {y}.
   * @throws ArithmeticException If the divisor {@code y} is zero.
   */
  public static int divideNumbers(int x, int y) {
    int result = x / y;
    return result;
  }

}