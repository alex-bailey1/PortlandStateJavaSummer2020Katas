package edu.pdx.cs410J.bail34;

import java.lang.reflect.Array;
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

  public static ArrayList<Integer> intToDigit(int n) {
    ArrayList<Integer> digits = new ArrayList<>();
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
//    if(number == 1)
//    {
//      return "I";
//    }
//    else
//    {
//      return "V";
//    }
    StringBuilder numeral = new StringBuilder();
    ArrayList<Integer> list = intToDigit(number);

    for(int i = list.size() - 1; i >= 0; i--)
    {
      int current = list.get(i);

      if(i == 3)
      {
        if(current <= 3)
        {
          for(int j = 0; j < current; j++)
          {
            numeral.append("M");
          }
        }
      }
      //the hundreds place
      if(i == 2) {
        if (current <= 3) {
          for (int j = 0; j < current; j++) {
            numeral.append("C");
          }
        } else if (current == 4) {
          numeral.append("CD");
        } else if (current >= 5 && current <= 8) {
          numeral.append("D");
          for (int j = 5; j < current; j++) {
            numeral.append("C");
          }
        } else if (current == 9) {
          numeral.append("CM");
        }
      }

        if(i == 1) {
          if (current <= 3) {
            for (int j = 0; j < current; j++) {
              numeral.append("X");
            }
          } else if (current == 4) {
            numeral.append("XL");
          } else if (current >= 5 && current <= 8) {
            numeral.append("L");
            for (int j = 5; j < current; j++) {
              numeral.append("X");
            }
          } else if (current == 9) {
            numeral.append("XC");
          }
        }


      if(i == 0) {
        if (current <= 3) {
          for (int j = 0; j < current; j++) {
            numeral.append("I");
          }
        } else if (current == 4) {
          numeral.append("IV");
        } else if (current >= 5 && current <= 8) {
          numeral.append("V");
          for (int j = 5; j < current; j++) {
            numeral.append("I");
          }
        } else if (current == 9) {
          numeral.append("IX");
        }
      }
  }



    return numeral.toString();
  }
}