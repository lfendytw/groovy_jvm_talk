import org.junit.Test

class GroovyPersonTest {
    @Test void personShouldHaveName() {
        GroovyPerson toTest = GroovyPerson.newInstance([name: "John"])
        assert toTest.name == "John", "instantiated Person should have name"
    }
    @Test void personShouldHaveDob() {
        GroovyPerson toTest = GroovyPerson.newInstance([dob: "14-12-1988"])
        assert toTest.dob == "14-12-1988", "instantiated Person should have dob"
    }
    @Test void personShouldHaveGender() {
        GroovyPerson toTest = GroovyPerson.newInstance([gender: "M"])
        assert toTest.gender == "M", "instantiated Person should have gender"
    }
}


