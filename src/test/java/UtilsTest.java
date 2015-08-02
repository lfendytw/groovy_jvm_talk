import org.junit.Test;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.Assert.*;

public class UtilsTest {

  @Test public void createsKeyValuePairFromListWithTwoItems() {
    List<String> listMap = new ArrayList<String>();
    listMap.add("key");
    listMap.add("value");
    Map<String, String> result = Utils.listToMap(listMap);
    assertEquals("value", result.get("key"));
  }

  @Test public void createsKeyValuePairFromListWithMoreThanTwoItems() {
    List<String> listMap = new ArrayList<String>();
    listMap.add("key1");
    listMap.add("value1");
    listMap.add("key2");
    listMap.add("value2");
    Map<String, String> result = Utils.listToMap(listMap);
    assertEquals("value1", result.get("key1"));
    assertEquals("value2", result.get("key2"));
  }

  @Test public void ignoresTrailingListItems() {
    List<String> listMap = new ArrayList<String>();
    listMap.add("key1");
    listMap.add("value1");
    listMap.add("key2");
    listMap.add("value2");
    listMap.add("ignoremeplease");
    Map<String, String> result = Utils.listToMap(listMap);
    assertEquals("value1", result.get("key1"));
    assertEquals("value2", result.get("key2"));
    assertEquals(result.keySet().size(), 2);
  }

  @Test public void findsTheFirstPersonCalledJim() {
    List<Person> jimAndOthers = new ArrayList<Person>();
    Person jim = new Person("James Kirk", "22-03-2233", "M");
    Person spock = new Person("Spock", "01-01-2230", "M");
    jimAndOthers.add(spock);
    jimAndOthers.add(jim);

    Person result = Utils.findJim(jimAndOthers);

    assertEquals(jim, result);
  }
}
