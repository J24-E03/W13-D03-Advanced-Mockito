package com.company.project.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Example class containing some sections that violate the Google Java Style Guide.
 */
public class Naming {
  public static final String DATE_PATTERN_CONSTANT = "dd.MM.yyyy";

  public static boolean isTrue() {
    return true;
  }

  /**
   * Checks if the given date fits the current year. Returns true if that is the case.
   *
   * @param inputValue The input value to check.
   */
  public static boolean isBoolean(Boolean inputValue) {
    return inputValue instanceof Boolean;
  }

  /**
   * Checks if the given date fits the current year. Returns true if that is the case.
   *
   * @param inputString The input string to parse.
   * @throws ParseException If the input string cannot be parsed.
   */
  public Date parseDateString(String inputString) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat(DATE_PATTERN_CONSTANT);
    return dateFormat.parse(inputString);
  }
}