import org.junit.Test
import static org.junit.Assert.*;

class GroovyPersonTest {

    @Test
    void "person should have its property"() {
      def personMap = [name: "John", dob: "14-12-1988", gender: "M"]

      personMap.forEach({prop, value ->
        GroovyPerson toTest = GroovyPerson.newInstance(["${prop}": value])
        assert toTest[prop] == value, "instantiated Person should have ${prop}"
      })
    }


    @Test public void personLocationVisitedShouldIncreaseWithNewAdditions() {
        Person toTest = new Person("","","");
        String location = "Some Location";
        toTest.addLocationVisited(location);
        assertEquals("new visited location should be remembered", toTest.timesVisitedLocation(location), 1);
        toTest.addLocationVisited(location);
        assertEquals("previously visited location should be increase", toTest.timesVisitedLocation(location), 2);
    }
    @Test public void personLocationVisitedShouldStartWithZero() {
        Person toTest = new Person("","","");
        assertEquals("never visited location should return zero", toTest.timesVisitedLocation("New Location"), 0);
    }
    @Test public void personLocationVisitedShouldBePrepopulated() {
        Person toTest = new Person("","","");
        assertEquals("Melbourne - 5", toTest.timesVisitedLocation("Melbourne"), 5);
        assertEquals("Sydney - 2", toTest.timesVisitedLocation("Sydney"), 2);
        assertEquals("Brisbane - 7", toTest.timesVisitedLocation("Brisbane"), 7);
        assertEquals("Adelaide - 3", toTest.timesVisitedLocation("Adelaide"), 3);
    }

}


