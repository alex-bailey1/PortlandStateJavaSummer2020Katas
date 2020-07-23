package edu.pdx.cs410J.bail34;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;

public class Kata {

  public int calculate(ArrayList<String> list)
  {
    int result = 0;
    Deque<Integer> num_list = new ArrayDeque<>();


    //        20 5 /        => 20/5 = 4
    //        4 2 + 3 -     => (4+2)-3 = 3
    //        3 5 8 * 7 + * => ((5*8)+7)*3 = 141

    for (String val : list) {
      if (isOperator(val)) {
        int operand1 = num_list.pop();
        int operand2 = num_list.pop();

        switch(val) {
          case "*":
            num_list.push(operand2 * operand1);
            break;
          case "/":
            num_list.push(operand2 / operand1);
            break;
          case "+":
            num_list.push(operand2 + operand1);
            break;
          case "-":
            num_list.push(operand2 - operand1);
            break;
          default:
            System.exit(1);
        }
      } else {
        try {
          Integer intVal = Integer.parseInt(val);
          num_list.push(intVal);
        } catch (NumberFormatException ex) {
          System.err.print("Not a valid input");
          System.exit(1);
        }
      }
    }
    return num_list.pop();
  }

  public boolean isOperator(String val) {
    ArrayList<String> operators = new ArrayList<>();
    operators.add("*");
    operators.add("/");
    operators.add("+");
    operators.add("-");
    return operators.contains(val);
  }

  public static void main(String[] args) {
    System.err.println("Missing command line arguments");
    System.exit(1);
  }

}