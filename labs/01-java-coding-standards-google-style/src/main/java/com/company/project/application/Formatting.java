// File: Formatting.java
package com.company.project.application;

import java.util.Calendar;
import java.util.Date;

/**
 * Provides utility methods for formatting and date validation.
 */
public class Formatting {

  public static final String DATE_PATTERN_GER = "dd.MM.yyyy";

  /**
   * Checks if the given date fits the current year.
   *
   * @param date The date to check.
   * @return True if the date is in the current year, false otherwise.
   */
  public static boolean isCurrentYear(Date date) {
    Calendar calInput = Calendar.getInstance();
    calInput.setTime(date);

    Calendar calNow = Calendar.getInstance();
    return calInput.get(Calendar.YEAR) == calNow.get(Calendar.YEAR);
  }

  /**
   * Checks if the given date fits the current month.
   *
   * @param date The date to check.
   * @return True if the date is in the current month, false otherwise.
   */
  public boolean isCurrentMonth(Date date) {
    Calendar calInput = Calendar.getInstance();
    calInput.setTime(date);

    Calendar calNow = Calendar.getInstance();
    return calInput.get(Calendar.MONTH) == calNow.get(Calendar.MONTH);
  }
}
