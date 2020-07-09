package edu.pdx.cs410J.bail34;

import org.junit.Test;

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

}
