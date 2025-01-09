// File: Naming.java
package com.company.project.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Provides naming-related utility methods.
 */
public class Naming {

  public static final String DATE_PATTERN = "dd.MM.yyyy";

  /**
   * Checks if the given input is true.
   *
   * @return True always.
   */
  public static boolean isTrue() {
    return true;
  }

  /**
   * Checks if the input value is a Boolean instance.
   *
   * @param inputValue The input to check.
   * @return True if the input is a Boolean, false otherwise.
   */
  public static boolean isBoolean(Boolean inputValue) {
    return inputValue instanceof Boolean;
  }

  /**
   * Parses a date string into a Date object.
   *
   * @param inputString The date string to parse.
   * @return A Date object representing the parsed date.
   * @throws ParseException If the input string cannot be parsed.
   */
  public Date parseDateString(String inputString) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN);
    return dateFormat.parse(inputString);
  }
}
