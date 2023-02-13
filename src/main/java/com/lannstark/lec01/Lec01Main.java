package com.lannstark.lec01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1) 값을 바꿀 수 있는 것
    final long number2 = 10L; // (2) 값을 바꿀 수 없는 것

    Long number3 = 1_000L; // (3)
    Person person = new Person("최태현"); // (4)

    final List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2));
    numbers.add(3);
    System.out.println("numbers = " + numbers);
  }

}
