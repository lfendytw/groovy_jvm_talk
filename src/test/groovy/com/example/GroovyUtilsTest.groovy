package com.example

import org.junit.Test
import org.junit.Before
import java.util.Map
import java.util.List
import java.util.ArrayList
import java.util.HashMap

class GroovyUtilsTest {
  GroovyUtils utils

  @Before
  void setup() {
    utils = new GroovyUtils()
  }

  @Test void "creates key value pair from a list with two items"() {
    List<String> strings = ["key", "value"]
    assert utils.listToMap(strings) == [key: "value"]
  }

  @Test void "creates key value pairs from list with more than two items"() {
    List<String> strings = ["key1", "value1", "key2", "value2"]
    assert utils.listToMap(strings) == [key1: "value1", key2: "value2"]
  }

  @Test void "if list is odd, the last element in the list should be a key with a null value"() {
    List<String> strings = ["key1", "value1", "key2", "value2", "key3"]
    assert utils.listToMap(strings) == [key1: "value1", key2: "value2", key3: null]
  }

  @Test void "find Jim"() {
    GroovyPerson jim = new GroovyPerson(name: "James Kirk")
    List<GroovyPerson> people = [new GroovyPerson(name: "Spock"), new GroovyPerson(name: "James Kirk")]
    assert utils.findJim(people) == jim
  }

}

