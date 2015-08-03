package com.demo;

import java.util.List;
import java.util.ArrayList;

public class PersonTransformer {
  public static List<Person> fromCsv(String csv){
    String[] rows = csv.split("\n");
    List<Person> toReturn = new ArrayList<Person>();
    for (String row : rows) {
      toReturn.add(fromCsvRow(row));
    }
    return toReturn;
  }

  private static Person fromCsvRow(String csvRow){
    String[] fields = csvRow.split(",");
    return new Person(fields[0],fields[1],fields[2]);
  }
}
