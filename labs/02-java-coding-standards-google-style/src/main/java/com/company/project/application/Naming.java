package com.company.project.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Example class containing some sections that violate the Google Java Style Guide.
 */
public class Naming {

  public static final String datePatternConstant = "dd.MM.yyyy";

  public static boolean IsTrue() {
    return true;
  }

  public static boolean isBoolean(Boolean input_value) {
    return input_value instanceof Boolean;
  }

  public Date parseDateString(String inputString) throws ParseException {
    SimpleDateFormat dateFormat = new SimpleDateFormat(datePatternConstant);
    return dateFormat.parse(inputString);
  }

}
