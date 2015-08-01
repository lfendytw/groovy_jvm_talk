import org.junit.Test

class GroovyPersonTest {
    @Test void personShouldHaveName() {
        GroovyPerson toTest = new GroovyPerson("John", "don't care", "don't care")
        assert toTest.name == "John", "instantiated Person should have name"
    }
    @Test void personShouldHaveDob() {
        GroovyPerson toTest = new GroovyPerson("don't care", "14-12-1988", "don't care")
        assert toTest.dob == "14-12-1988", "instantiated Person should have dob"
    }
    @Test void personShouldHaveGender() {
        GroovyPerson toTest = new GroovyPerson("don't care", "don't care", "M")
        assert toTest.gender == "M", "instantiated Person should have gender"
    }
}


