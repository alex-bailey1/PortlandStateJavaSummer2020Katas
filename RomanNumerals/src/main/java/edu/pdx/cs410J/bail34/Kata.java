package edu.pdx.cs410J.bail34;

import java.util.ArrayList;
import java.util.List;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {
                                                                                    

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

  public static List<Integer> intToDigit(int n) {
    List<Integer> digits = new ArrayList<>();
    while(n > 0) {
      digits.add(n % 10);
      n = n / 10;
    }
    return digits;
  }

  // 123 -> 3, 2, 1,

  /**
   * Converts an arabic numeral representation into Roman numerals
   * "", I, II, III, IV, V, VI, VII, VIII, IX
   *     X, XX, XXX, XL, L, LX, LXX, LXXX, XC
   *
   *
   * @param number
   * @return
   */
  public static String romanNumeralFor(int number) {
    if(number == 1)
    {
      return "I";
    }
    else
    {
      return "V";
    }
  }
}