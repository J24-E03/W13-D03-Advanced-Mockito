package com.company.project.application;

/**
 * Example class containing some sections that violate the Google Java Style Guide.
 */
public class Javadoc {
  /**
   * Evaluates if the input number is greater than zero.
   *
   * @return true if the input number is greater than zero, false otherwise.
   */
  public boolean isPositive(int input) {
    return (input > 0);
  }

  /**
   * Evaluates if the first input number is greater than the second input.
   * Returns true if the first number is greater, false otherwise.
   *
   * @param firstNumber the first number to compare.
   * @param secondNumber the second number to compare.
   * @return true if the first number is greater than the second number, false otherwise.
   */
  public boolean isGreaterThan(double firstNumber, double secondNumber) {
    return (firstNumber > secondNumber);
  }
}