import org.junit.Test

class GroovyPersonTest {

    @Test
    void "person should have its property"() {
      def personMap = [name: "John", dob: "14-12-1988", gender: "M"]

      personMap.forEach({prop, value ->
        GroovyPerson toTest = GroovyPerson.newInstance(["${prop}": value])
        assert toTest[prop] == value, "instantiated Person should have ${prop}"
      })
    }
}


