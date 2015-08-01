import org.junit.Test
import static org.junit.Assert.*

class GroovyPersonTest {
    @Test void personShouldHaveName() {
        GroovyPerson toTest = new GroovyPerson("John", "don't care", "don't care")
        assertEquals("instantiated Person should have name", toTest.name, "John")
    }
    @Test void personShouldHaveDob() {
        GroovyPerson toTest = new GroovyPerson("don't care", "14-12-1988", "don't care")
        assertEquals("instantiated Person should have dob", toTest.dob, "14-12-1988")
    }
    @Test void personShouldHaveGender() {
        GroovyPerson toTest = new GroovyPerson("don't care", "don't care", "M")
        assertEquals("instantiated Person should have gender", toTest.gender, "M")
    }
}


