import org.junit.Test
import static org.junit.Assert.*

public class GroovyPersonTest {
    @Test public void personShouldHaveName() {
        GroovyPerson toTest = new GroovyPerson("John", "don't care", "don't care")
        assertEquals("instantiated Person should have name", toTest.getName(), "John")
    }
    @Test public void personShouldHaveDob() {
        GroovyPerson toTest = new GroovyPerson("don't care", "14-12-1988", "don't care")
        assertEquals("instantiated Person should have dob", toTest.getDob(), "14-12-1988")
    }
    @Test public void personShouldHaveGender() {
        GroovyPerson toTest = new GroovyPerson("don't care", "don't care", "M")
        assertEquals("instantiated Person should have gender", toTest.getGender(), "M")
    }
}


