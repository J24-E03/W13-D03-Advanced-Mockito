import java.util.Scanner;

public class Calculator {
  public static void main(String[] args)
  {
    System.out.println("Enter first and second number:");
    Scanner input = new Scanner(System.in);

    int num1,num2;
    num1 = input.nextInt();
    num2 = input.nextInt();

    System.out.println("Enter the operation: + for addition, - for subtraction, * for multiplication or / for division:");
    String calc_operation;
    calc_operation = input.next();

    switch (calc_operation){
      case "+":
        System.out.println(add(num1,num2));
        break;
      case "-":
        System.out.println(sub(num1,num2));
        break;
      case "*":
        System.out.println(multiply(num1,num2));
        break;
      case "/":
        if (num2 !=0){
          System.out.println(divide(num1,num2));
        } else {
          System.out.println("You cannot divine by 0");
        }
        break;
      default:
        System.out.println("Invalid selection");
    }
  }

  public static int add(int x, int y){
    return x + y;
  }


  public static int sub(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int divide(int x, int y) {
    return x / y;
  }

}