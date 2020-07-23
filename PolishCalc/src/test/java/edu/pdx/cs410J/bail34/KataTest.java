package edu.pdx.cs410J.bail34;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class KataTest {

  @Test
  public void canAdd()
  {
    Kata calc = new Kata();
    ArrayList<String> list = new ArrayList<>();
    list.add("1");
    list.add("1");
    list.add("+");
    int result = calc.calculate(list);
    assertThat(result, equalTo(2));
  }

  @Test
  public void canDiv()
  {
    Kata calc = new Kata();
    ArrayList<String> list = new ArrayList<>();
    list.add("10");
    list.add("2");
    list.add("/");
    int result = calc.calculate(list);
    assertThat(result, equalTo(5));
  }

  @Test
  public void canSub()
  {
    Kata calc = new Kata();
    ArrayList<String> list = new ArrayList<>();
    list.add("1");
    list.add("1");
    list.add("-");
    int result = calc.calculate(list);
    assertThat(result, equalTo(0));
  }

  @Test
  public void canMult()
  {
    Kata calc = new Kata();
    ArrayList<String> list = new ArrayList<>();
    list.add("1");
    list.add("1");
    list.add("*");
    int result = calc.calculate(list);
    assertThat(result, equalTo(1));
  }

  @Test
  public void testCase3()
  {
    Kata calc = new Kata();
    ArrayList<String> list = new ArrayList<>();
    list.add("3");
    list.add("5");
    list.add("8");
    list.add("*");
    list.add("7");
    list.add("+");
    list.add("*");
    int result = calc.calculate(list);
    assertThat(result, equalTo(141));
  }
}

