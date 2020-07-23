package edu.pdx.cs410J.bail34;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.comparesEqualTo;
import static org.hamcrest.Matchers.equalTo;

public class PolishCalcTest {

    @Test
    public void canAdd()
    {
        PolishCalc calc = new PolishCalc();
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
        PolishCalc calc = new PolishCalc();
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
        PolishCalc calc = new PolishCalc();
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
        PolishCalc calc = new PolishCalc();
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
        PolishCalc calc = new PolishCalc();
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
