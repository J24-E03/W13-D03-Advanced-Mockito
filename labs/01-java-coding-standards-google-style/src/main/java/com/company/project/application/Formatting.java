package com.company.project.application;

import java.util.Calendar;
import java.util.Date;

/**
 * Example class containing some sections that violate the Google Java Style Guide.
 */
public class Formatting {

  public static final String DATE_PATTERN_GER = "dd.MM.yyyy";

  /**
   * Checks if the given date fits the current year. Returns true if that is the case.
   */
  public static boolean isCurrentYear(Date date) {
    Calendar calInput = Calendar.getInstance();
    calInput.setTime(date);

    Calendar calNow = Calendar.getInstance();

    return (calInput.get(Calendar.YEAR) == calNow.get(Calendar.YEAR));



  }

  /**
   * Checks if the given date fits the current month. Returns true if that is the case.
   */
  public boolean isCurrentMonth(Date date) {
    Calendar calInput = Calendar.getInstance();
    calInput.setTime(date);

    Calendar calNow = Calendar.getInstance();

    return (calInput.get(Calendar.MONTH) == calNow.get(Calendar.MONTH));
  }


}
