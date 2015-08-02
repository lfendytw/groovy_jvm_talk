import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test public void personShouldHaveName() {
        Person toTest = new Person("John", "don't care", "don't care");
        assertEquals("instantiated Person should have name", toTest.getName(), "John");
    }
    @Test public void personShouldHaveDob() {
        Person toTest = new Person("don't care", "14-12-1988", "don't care");
        assertEquals("instantiated Person should have dob", toTest.getDob(), "14-12-1988");
    }
    @Test public void personShouldHaveGender() {
        Person toTest = new Person("don't care", "don't care", "M");
        assertEquals("instantiated Person should have gender", toTest.getGender(), "M");
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

