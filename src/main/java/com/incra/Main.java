package com.incra;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

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