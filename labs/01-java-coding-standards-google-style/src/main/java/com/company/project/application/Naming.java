package com.company.project.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Example class containing some sections that violate the Google Java Style Guide.
 */
public class Naming {

  public static final String DatePatternConstant = "dd.MM.yyyy";

  public static boolean isTrue() {
    return true;
  }

  /**
   * Checks whether the provided input is an instance of {@link Boolean}.
   *
   * @param inputValue The value to be checked.
   * @return {true} if the input value is an instance of {Boolean}, {false} otherwise.
   */
  public static boolean isBoolean(Boolean inputValue) {
    return inputValue instanceof Boolean;
  }
  /**
   * Parses a string into a {@link Date} object based on the predefined date pattern.
   *
   * @param inputString The string to be parsed into a date.
   * @return The parsed {Date} object.
   * @throws ParseException If the input string cannot be parsed into a valid date.
   */

  public Date parseDateString(String inputString) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat(DatePatternConstant);
    return dateFormat.parse(inputString);
  }

}
