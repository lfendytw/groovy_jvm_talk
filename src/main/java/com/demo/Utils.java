package com.demo;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Utils {

  public static Map<String, String> listToMap(List<String> list) {
    Map<String, String> result = new HashMap<String, String>();
    for (int i = 0; i < list.size() - 1; i += 2) {
      result.put(list.get(i), list.get(i + 1));
    }

    if (list.size() % 2 == 1) {
      result.put(list.get(list.size() - 1), null);
    }

    return result;
  }

  public static Person findJim(List<Person> people) {
    Person jim = people.stream().filter(x -> {return x.getName().equals("James Kirk");}).findFirst().get();
    return jim;
  }

  public static String doTheOverload(Object o) {
    return "passed in arg is OBJECT";
  }

  public static String doTheOverload(String s) {
    return "passed in arg is STRING";
  }

}
