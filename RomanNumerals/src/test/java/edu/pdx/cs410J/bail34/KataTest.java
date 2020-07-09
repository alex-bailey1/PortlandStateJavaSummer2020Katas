package edu.pdx.cs410J.bail34;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class KataTest
{

//  @Test
//  public void romanNumeralFor1IsI() {
//    assertThat(Kata.romanNumeralFor(1), equalTo("I"));
//  }
//
//  @Test
//  public void romanNumeralFor5isV()
//  {
//    assertThat(Kata.romanNumeralFor(5), equalTo("V"));
//  }

  @Test
  public void digitsReturns5() {
    List<Integer> list = new ArrayList<>();
    list.add(5);
    assertThat(Kata.intToDigit(5), equalTo(list));
  }

  @Test
  public void digitsReturns53() {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(5);
    assertThat(Kata.intToDigit(53), equalTo(list));
  }

  @Test
  public void digitsReturn100()
  {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(0);
    list.add(0);
    list.add(1);
    assertThat(Kata.intToDigit(100), equalTo(list));
  }


  @Test
  public void romanNumeral100()
  {
    assertThat(Kata.romanNumeralFor(100), equalTo("C"));
  }

  @Test
  public void romanNumeral1000()
  {
    assertThat(Kata.romanNumeralFor(1000), equalTo("M"));
  }

  @Test
  public void romanNumeral3000()
  {
    assertThat(Kata.romanNumeralFor(3000), equalTo("MMM"));
  }

  @Test
  public void romanNumeral400()
  {
    assertThat(Kata.romanNumeralFor(400), equalTo("CD"));
  }

  @Test
  public void romanNumeral3400()
  {
    assertThat(Kata.romanNumeralFor(3400), equalTo("MMMCD"));
  }

  @Test
  public void romanNumeral700()
  {
    assertThat(Kata.romanNumeralFor(700), equalTo("DCC"));
  }

  @Test
  public void romanNumeral900()
  {
    assertThat(Kata.romanNumeralFor(900), equalTo("CM"));
  }

  @Test
  public void romanNumeral10(){
    assertThat(Kata.romanNumeralFor(10), equalTo("X"));
  }

  @Test
  public void romanNumberal30()
  {
    assertThat(Kata.romanNumeralFor(30), equalTo("XXX"));
  }

  @Test
  public void romanNumberal40()
  {
    assertThat(Kata.romanNumeralFor(40), equalTo("XL"));
  }

  @Test
  public void romanNumberal70()
  {
    assertThat(Kata.romanNumeralFor(70), equalTo("LXX"));
  }

  @Test
  public void romanNumberal90()
  {
    assertThat(Kata.romanNumeralFor(90), equalTo("XC"));
  }

}
