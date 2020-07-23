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

}
