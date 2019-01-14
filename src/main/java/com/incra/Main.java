package com.incra;

import java.util.ArrayList;
import java.util.List;

interface MyGreeting {
  String processName(String str);
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

  }
}
