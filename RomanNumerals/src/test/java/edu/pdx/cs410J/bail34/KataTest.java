package edu.pdx.cs410J.bail34;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

  @Test
  public void romanNumeralFor1IsI() {
    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
  }

  @Test
  public void romanNumeralFor5isV()
  {
    assertThat(Kata.romanNumeralFor(5), equalTo("V"));
  }

  @Test
  public void digitsReturns5() {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    assertThat(Kata.intToDigit(5), equalTo(list));
  }

  @Test
  public void digitsReturns53() {
    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    assertThat(Kata.intToDigit(53), equalTo(list));
  }

}
