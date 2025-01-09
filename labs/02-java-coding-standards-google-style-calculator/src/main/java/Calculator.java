import java.util.Scanner;

public class Calculator {
  public static void main(String[] args)
  {
    System.out.println("Enter first and second number:");
    Scanner INPUT= new Scanner(System.in);

    int num1,num2;
    num1 = INPUT.nextInt();
    num2 = INPUT.nextInt();

    System.out.println("Enter the operation: + for addition, - for subtraction, * for multiplication or / for division:");
    String calc_operation;
    calc_operation = INPUT.next();

    switch (calc_operation){
      case "+":
        System.out.println(add( num1,num2));
        break;
      case "-":
        System.out.println(sub( num1,num2));
        break;
      case "*":
        System.out.println(Multiply( num1,num2));
        break;
      case "/":
        System.out.println(divide_numbers( num1,num2));
        break;
      default:
        System.out.println("No operation selected");
    }
  }

  public static int add(int x, int y)
  {
    int result = x + y;
    return result;
  }

  public static int sub(int x, int y)
  {
    int result = x-y;
    return result;
  }

  public static int Multiply(int x, int y)
  {
    int result = x*y;
    return result;
  }

  public static int divide_numbers(int x, int y)
  {
    int result = x/y;
    return result;
  }

}