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
    people.find { it.name == "James Kirk"  }
  }

}
