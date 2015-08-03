package com.example

class GroovyUtils {

  Map<String, String> listToMap(List<String> list) {
    Map<String, String> map = [:]
    list.collate(2).each {
      map[it[0]] = it[1]
    }
    map 
  }

  GroovyPerson findJim(List<GroovyPerson> people) {
    people.find { it.name == "James Kirk" }
  }

  Integer doTheOverload(Object o) {
    System.out.println("Hey, I'm the object version of the method")
    1
  }

  Integer doTheOverload(String s) {
    System.out.println("Hey, I'm the string version of the method")
    2
  }

}
