package com.incra;

import java.util.ArrayList;
import java.util.List;

interface MyGreeting {
  String processName(String str);
}

class Something {
  String startsWith(String s) {
    return String.valueOf(s.charAt(0));
  }
}

@FunctionalInterface
interface Converter<F, T> {
  T convert(F from);
}

interface Formula {
  double calculate(int a);

  default double sqrt(int a) {
    return Math.sqrt(a);
  }
}

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    MyGreeting morningGreeting = (str) -> "Good Morning " + str + "!";
    MyGreeting eveningGreeting = (str) -> "Good Evening " + str + "!";

    // Output: Good Morning Luis!
    System.out.println(morningGreeting.processName("Luis"));

    // Output: Good Evening Jessica!
    System.out.println(eveningGreeting.processName("Jessica"));

    List<String> stringCollection = new ArrayList<>();
    stringCollection.add("ddd2");
    stringCollection.add("aaa2");
    stringCollection.add("bbb1");
    stringCollection.add("aaa1");
    stringCollection.add("bbb3");
    stringCollection.add("ccc");
    stringCollection.add("bbb2");
    stringCollection.add("ddd1");

    stringCollection
      .stream()
      .filter((s) -> s.startsWith("a"))
      .forEach(System.out::println);

    Something something = new Something();
    Converter<String, String> converter = something::startsWith;
    String converted = converter.convert("Java");
    System.out.println(converted);    // "J"

    // Now apply a functional interface to the members of the list.
    Formula formula = new Formula() {
      @Override
      public double calculate(int a) {
        return sqrt(a * 100);
      }
    };

    System.out.println(formula.calculate(100));     // 100.0
    System.out.println(formula.sqrt(16));           // 4.0
  }
}
