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

  String doTheOverload(Object o) {
    "passed in arg is OBJECT"
  }

  String doTheOverload(String s) {
    "passed in arg is STRING"
  }

}
