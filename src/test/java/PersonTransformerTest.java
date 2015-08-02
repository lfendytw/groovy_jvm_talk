import org.junit.Test;
import static org.junit.Assert.*;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

public class PersonTransformerTest {
  @Test public void shouldCreatePeopleFromCSV(){
    String csv = "Adam,1-1-1989,M\n"
      + "Barbara,2-1-1977,F\n"
      + "Celine,2-4-1947,F\n"
      + "Don,8-11-1997,M\n"
      + "Edward,12-3-1979,M\n"
      + "Fred,9-7-1988,M\n";
    List<Person> people = PersonTransformer.fromCsv(csv);
    assertEquals("should transform all row", people.size(), 6);


    Person adam = people.get(0);
    assertEquals("should transform row name correctly", adam.getName(), "Adam");
    assertEquals("should transform row dob correctly", adam.getDob(), "1-1-1989");
    assertEquals("should transform row gender correctly", adam.getGender(), "M");
  }
}
