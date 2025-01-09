// File: Javadoc.java
package com.company.project.application;

/**
 * Provides methods to evaluate numeric relationships.
 */
public class Javadoc {

  /**
   * Checks if the input number is greater than zero.
   *
   * @param input The number to check.
   * @return True if the input is greater than zero, false otherwise.
   */
  public boolean isPositive(int input) {
    return input > 0;
  }

  /**
   * Checks if the first number is greater than the second number.
   *
   * @param firstNumber The first number to compare.
   * @param secondNumber The second number to compare.
   * @return True if the first number is greater, false otherwise.
   */
  public boolean isGreaterThan(double firstNumber, double secondNumber) {
    return firstNumber > secondNumber;
  }
}
